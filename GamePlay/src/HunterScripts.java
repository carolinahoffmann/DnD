package GamePlay.src;

import java.util.Scanner;

public class HunterScripts {


    public static void characterHunterScript() {
        System.out.println("Who are you gonna be, choose wisely \nPick a character by entering their number");
        Scanner scanner = new Scanner(System.in);
        String user2 = scanner.nextLine();

        if((user2.equals("1")||(user2.equals("2")))){
            new HunterScripts().startGameScriptHunter();
        }
    }

    private void startGameScriptHunter() {
        System.out.println("17 Ravenscroft Lane. Come alone. Sent.\n" +
                "Now we wait. I watch the screen, the glow painting my knuckles white. It isn't the most elegant plan. A mysterious text? A bit cliché." +
                " \nBut it's the only play. He's cautious, paranoid. Without the bait of his friend, he'd never take the hook.\n" +
                "My phone vibrates. The audio feed from Mark's car erupts with his excited, stupid voice. \"Seventeen Ravenscroft Lane! I got it too!\"\n" +
                "A smile touches my lips. Perfect. The herd animal, leading the predator right to its heart.\n" +
                "I listen as my target tries to warn him, his voice tight with fear. Good. Let him be afraid. Let him rush. Fear makes you sloppy.\n" +
                "The engine roars in the feed. He's moving. The game is on.");
        System.out.println("Type 'start' to roll the dice...");

        Scanner scanner = new Scanner(System.in);
        String user2 = scanner.nextLine().toLowerCase().trim();
        if(user2.contentEquals("start")){
            new HunterScripts().startFirstDecisionHunter();
        }
    }

    private void startFirstDecisionHunter(){
        RollingDice myDice1 = new RollingDice();
        int randomNumber = myDice1.rollDiceDecision();
        String answer = switch (randomNumber) {
            case 1 -> "case1";
            case 2 -> "case2";
            case 3 -> "case3";
            default -> "";
        };
        System.out.println(answer);
    }
}


