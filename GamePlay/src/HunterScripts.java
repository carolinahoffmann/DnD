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
        System.out.println("Type 'start' to begin the game or 'end' to quit at any time.");

        Scanner scanner = new Scanner(System.in);
        String user2 = scanner.nextLine().toLowerCase().trim();
        if(user2.contentEquals("start")){
            new HunterScripts().startFirstDecisionHunter();
        }
    }

    private void startFirstDecisionHunter(){

            RollingDice dice = new RollingDice();
            int rolledNumber = dice.rollDice();

            System.out.println("You rolled a: " + rolledNumber);

            HunterSerializer serializer =
                    new HunterSerializer("Gameplay/src/hunterRooms.json");

            String chosenRoom = serializer.getRandomRoomByDice(rolledNumber);

            System.out.println("Next location: " + chosenRoom);

            generatingResponse2Hunter();


        //new GameSettings().createJsonHunterRooms();
        //System.out.println("Your choice. Type in the number of the option");

        //Scanner scanner = new Scanner(System.in);
        //String user2 = scanner.nextLine();
        //scanner.close();

    }

    public void generatingResponse2Hunter() {
        RollingDice myDice = new RollingDice();
        int randomNumber = myDice.rollDice();
        String answer = switch (randomNumber) {
            case 1 -> "From upstairs, I hear his hesitant steps below, each one a question he’s too afraid to ask out loud. I don’t move—prey always looks up eventually.";
            case 2 -> "The corridor turns sound into a weapon, carrying his breathing straight to me. He doesn’t realize how clearly fear echoes in narrow spaces.";
            case 3 -> "I watch from the shadowed corner as he scans the living room, pretending calm. He always forgets to check behind him.";
            case 4 -> "The kitchen smells of cold metal and old meals, a place where people feel safe. Safety makes them careless.";
            case 5 -> "Boxes stacked too neatly tell me he’s been here already. He thinks clutter hides him; it only maps his panic.";
            case 6 -> "The mirror reflects more than faces when the light hits just right. I wait for him to look up.";
            case 7 -> "Tools lie untouched, but the chair is warm. He was here recently, close enough to hear me breathe.";
            case 8 -> "I shut the pantry door softly and listen to him freeze on the other side. Silence is louder when trapped.";
            case 9 -> "Stairs turn fear into rhythm, each step a countdown. I time my movement between his heartbeats.";
            case 10 -> "Upstairs corridors are thinner, tighter, easier to control. He’s running out of choices.";
            case 11 -> "Toys on the floor suggest innocence, but fear doesn’t care about age. I step carefully, enjoying the contrast.";
            case 12 -> "The bedroom holds secrets people think are private. I let him believe this door means safety.";
            case 13 -> "Water masks sound, which makes surprises easier. I wait until he thinks he’s alone.";
            case 14 -> "The hidden room was never meant to keep people out, only to keep them in. He’s finally found it.";
            default -> "";
        };
        System.out.println(answer);
    }
}