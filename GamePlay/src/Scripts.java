package GamePlay.src;

import java.util.Scanner;

public class Scripts {




    public void startScript() {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        int maxTries = 3;

        while (tries < maxTries) {
            String user = scanner.nextLine().toLowerCase().trim();
            GameSettings gameSettings = new GameSettings();
            Scripts scripts = new Scripts();

            if (user.contentEquals("hunter")) {
                gameSettings.createJsonHunterSettings();
                HunterScripts.characterHunterScript();
                break;
            } else if (user.contentEquals("hunted")) {
                gameSettings.createJsonHuntedSettings();
                HuntedScripts.characterHuntedScript();
                break;
            } else {
                System.out.println("Try again.\nHunter or hunted?");
                tries++;
            }
        }
        scanner.close();
        if (tries == maxTries) {
            throw new IllegalArgumentException("Game over...");
        }
    }


    public void endgame(){
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine().toLowerCase().trim();
        Scripts scripts = new Scripts();

        if (user.contentEquals("end")){
            scripts.saveGame();
        }
    }

    public void saveGame() {

    }

}




