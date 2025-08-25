package GamePlay.src;

import java.util.Scanner;

public class gameSettings {


    public void gameStart() {
        System.out.println("Start\nChoose your character\n\nAre you a hunter or the hunted?");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();

        String userAnswer = switch (user) {
            case "hunter" -> "The quarry is in sight. Prepare to engage.";
            case "Hunter" -> "The quarry is in sight. Prepare to engage.";
            case "hunted" -> "The murderer lies in wait. Get ready.";
            case "Hunted" -> "The murderer lies in wait. Get ready.";
            default -> "";
        };
        System.out.println(userAnswer);

        if (user.contentEquals("hunter")){
            //scripts myscripts = new scripts();
            //myscripts.generatingResponse();
        } else if (user.contentEquals("Hunter")) {

        } else if (user.contentEquals("hunted")) {

        }else if (user.contentEquals("Hunted")){

        }
    }
    public void jsonSettings() {
            huntedSerializer serializer = new huntedSerializer("Gameplay/src/huntedCharacter.json");
            serializer.deserializeHunted();
            hunterSerializer serializer1 = new hunterSerializer("Gameplay/src/hunterCharacter.json");
            serializer1.deserializeHunter();
        }
    }


