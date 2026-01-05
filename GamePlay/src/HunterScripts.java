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
        System.out.println("Type 'start'");

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
            case 1 -> "'I steady my breath —whatever’s hunting me, I’ll hunt it first.'" +
                    " But as your finger tightens on the trigger, you see it: your own silhouette aiming back from the dark.";
            case 2 -> "'I follow the blood trail—tracks like these don’t vanish for no reason.'" +
                    " The trail ends at a mirror-smooth puddle… and when you lean closer, your reflection grins before you do.";
            case 3 -> "'I climb the rusted catwalk for higher ground—better view, better odds.'" +
                    " The metal groans beneath your boots, whispering your name as something crawls up from below.";
            case 4 -> "'I light a flare and toss it into the hallway—no shadows can hide now.'" +
                    " But the light bends, twisting back toward you… and forms the outline of something crawling upside down on the ceiling.";
            case 5 -> "'I open the old hunter’s journal—maybe it holds the secret to surviving this place.'" +
                    " The ink bleeds across the page, rearranging into a single sentence: *You never left the hunt.*";
            case 6 -> "'I drive my knife into the ground—marking my path, just in case I get turned around.'" +
                    " Moments later, you pass the same mark again… but the knife is still wet, and now it’s pointing at you.";
            default -> "";
        };
        System.out.println(answer);
    }
}