package GamePlay.src;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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

    //JAVA zu JSON (JSON Datei zu schreiben)
    public String serializeHunted(){

        return "";
    }
}
