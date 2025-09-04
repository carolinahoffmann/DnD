package GamePlay.src;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class hunterSerializer {
    private String path;

    public hunterSerializer(String path) {
    this.path = path;
    }


    public String prettier (String jsonString) {
        return jsonString.replaceAll("[{}\"]", " ");
    }

    //JSON zu JAVA(JSON Datei gelesen werden kann)
    public List<character> deserializeHunter() {
        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            StringBuilder properJson = new StringBuilder();
            for(String line : lines){
                properJson.append(line);
            }

            JSONObject jsonObject = new JSONObject(properJson.toString());

            ArrayList<character> characterList = new ArrayList<>();
            for(String key : jsonObject.keySet()){
                character currentChar = new character();
                Object value = jsonObject.get(key);
                String jsonString = prettier(value.toString());
                System.out.println(key + jsonString);
                characterList.add(currentChar);
            }
            return characterList;
        }catch (IOException r){
            System.out.println("[ERROR] Failed to open file at path: " + path);
        }catch (JSONException r){
            System.out.println("[ERROR] Json parsing failed: " + r.toString());
        }
        return new ArrayList<character>();
    }

    //JAVA zu JSON (JSON Datei zu schreiben)
    public String serializeHunter(){

        return "";
    }
}
