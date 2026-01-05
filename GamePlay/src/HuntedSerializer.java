package GamePlay.src;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HuntedSerializer {
    private String path;

    public HuntedSerializer(String path){ //konstruktor
        this.path = path; //dass er den richtigen Pfad zwischenspeichert
    }


    public String prettier (String jsonString) {
        return jsonString.replaceAll("[{}]"," ").replaceAll("\"","");
    }

    //JSON zu JAVA(JSON Datei gelesen werden kann)
    public List<Character> deserializeHunted()
    {
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            StringBuilder properJson = new StringBuilder();
            for(String line : lines) {
                properJson.append(line); //geht jede Zeile durch und fügt an den String an
            }

            JSONObject jsonObject = new JSONObject(properJson.toString());
            ArrayList<Character> characterList = new ArrayList<>();
            for (String key : jsonObject.keySet()) {
                Character currentChar = new Character();
                Object value = jsonObject.get(key);
                String jsonString = prettier(value.toString());
                System.out.println(key + jsonString);
                characterList.add(currentChar);
            }

            return characterList;
        } catch (IOException e) {
            System.out.println("[ERROR] Failed to open file at path: " + path);
        } catch (JSONException e) {
            System.out.println("[ERROR] Json parsing failed: " + e.toString());
        }

        return new ArrayList<Character>();

    }

    public String getRandomRoomByDice(int diceNumber) {

        try {
            String json = Files.readString(Path.of(path));
            JSONObject jsonObject = new JSONObject(json);

            List<String> possibleRooms = new ArrayList<>();

            for (String room : jsonObject.keySet()) {
                String value = jsonObject.get(room).toString();

                if (Integer.parseInt(value) == diceNumber) {
                    possibleRooms.add(room);
                }
            }

            if (possibleRooms.isEmpty()) {
                return "NO ROOM FOUND";
            }

            // Wenn mehrere Räume → zufällig entscheiden
            Random random = new Random();
            return possibleRooms.get(random.nextInt(possibleRooms.size()));

        } catch (IOException e) {
            System.out.println("[ERROR] Failed to open file at path: " + path);
        } catch (JSONException e) {
            System.out.println("[ERROR] Json parsing failed: " + e);
        }

        return "ERROR";
    }


    //JAVA zu JSON (JSON Datei zu schreiben)
    public String serializeHunted(){

        return "";
    }
}
