package GamePlay.src;

import java.util.Scanner;

public class gameSettings {


    public void gameStart() {
        System.out.println("Start\nChoose your character\n\nAre you a hunter or the hunted?");
        new scripts().startScript();
    }
    public void jsonSettings() {
            huntedSerializer serializer = new huntedSerializer("Gameplay/src/huntedCharacter.json");
            serializer.deserializeHunted();
            hunterSerializer serializer1 = new hunterSerializer("Gameplay/src/hunterCharacter.json");
            serializer1.deserializeHunter();
        }
    }


