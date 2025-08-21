package GamePlay.src;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class huntedSerializer {
    private String path;

    public huntedSerializer(String path){ //konstruktor
        this.path = path; //dass er den richtigen Pfad zwischenspeichert
    }

    //JSON zu JAVA(JSON Datei gelesen werden kann)
    public List<character> deserializeHunted()
    {
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            StringBuilder properJson = new StringBuilder();
            for(String line : lines) {
                properJson.append(line); //geht jede Zeile durch und fügt an den String an
            }

            JSONObject jsonObject = new JSONObject(properJson.toString());

            ArrayList<character> characterList = new ArrayList<>();
            for (String key : jsonObject.keySet()) {
                character currentChar = new character();
                Object value = jsonObject.get(key);
                System.out.println("Key: " + key + ", Value: " + value);
                characterList.add(currentChar);
            }

            return characterList;
        } catch (IOException e) {
            System.out.println("[ERROR] Failed to open file at path: " + path);
        } catch (JSONException e) {
            System.out.println("[ERROR] Json parsing failed: " + e.toString());
        }

        return new ArrayList<character>();
        
    }

    //JAVA zu JSON (JSON Datei zu schreiben)
    public String serializeHunted(){


        return "";
    }
}
