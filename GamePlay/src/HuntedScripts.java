package GamePlay.src;

import java.util.Scanner;

public class HuntedScripts {

    public static void characterHuntedScript() {
        System.out.println("Who are you gonna be, choose wisely \nPick a character by entering their number");
        Scanner scanner = new Scanner(System.in);
        String user2 = scanner.nextLine();

        if((user2.equals("1")||(user2.equals("2"))||(user2.equals("3")))){
            new HuntedScripts().startGameScriptHunted();
        }
    }

    private void startGameScriptHunted() {
        System.out.println("Your phone buzzes violently in your pocket, shattering the quiet of your evening. It’s a single text message from an unknown number." +
                "No greeting, no explanation. \nJust an address. UNKNOWN NUMBER: 17 Ravenscroft Lane. Come alone. " +
                "A cold knot forms in your stomach. Before the panic can fully take hold, your phone rings. It’s your friend, Mark.\n" +
                "\"Hey,\" you answer, your voice tense. \"You are not going to believe what I just—\"\n" +
                "\"Seventeen Ravenscroft Lane,\" Mark interrupts, his words coming in a rushed, excited gasp. \"I got it too. What the hell is this? Some kind of prank?\"\n" +
                "You can hear the rumble of his car engine in the background. Your blood runs cold.\n" +
                "\"Wait, you're going now? Mark, don't be stupid, we don't know what this is!\"\n" +
                "\"Are you kidding? This is the most interesting thing that's happened all year! I'm already on my way. Meet me there. We'll figure it out together.\"\n" +
                "The line goes dead.\n" +
                "You hurry, pushing your car well past the speed limit, a sense of dread growing with every mile." +
                " \nThe address leads you to a dilapidated house at the end of a long, deserted lane, shrouded in mist. You are late.\n" +
                "The scene is wrong. Deeply wrong.\n" +
                "No cars are in sight. Not even Mark's. There are no people, and the nearest neighbor is nowhere visible." +
                " An oppressive silence hangs over everything, broken only by the wind.\n" +
                "Then, a single, piercing scream cuts through the air from inside the house. The front door hangs open, a dark mouth inviting you in.\n" +
                "Your heart hammers against your ribs. As you approach, your eyes catch a glimpse of something in the dim hallway through the open door. An arm. Limp. Motionless.\n" +
                "But it’s the watch on the wrist that makes your breath catch in your throat. You know that watch. You gave it to Mark for his birthday.\n" +
                "What do you do?");
        System.out.println("Type 'start'");
        new HuntedScripts().startFirstDecisionHunted();
    }

    private void startFirstDecisionHunted(){

        System.out.println("Pick an option by typing in their number");

    }


    public void generatingResponse2Hunted() {
        RollingDice myDice = new RollingDice();
        int randomNumber = myDice.rollDice();
        String answer = switch (randomNumber) {
            case 1 -> "'I run down to the basement—maybe there’s a hiding spot or an exit'" +
                    " but what awaits you below isn’t escape. Instead, a room filled with old, bloody shackles... " +
                    " and something stirs in the shadows";
            case 2 -> "'I rush into the bathroom and shove the cabinet against the door!'" +
                    " But as you turn around, you see a second figure in the mirror—standing right behind you, " +
                    " even though no one is there.";
            case 3 -> "'I freeze and listen... Maybe it's just a rat?'" +
                    " The scratching grows louder—then a bloody hand bursts through the wall and grabs your arm!";
            case 4 -> "'I clutch the jagged remains of a bottle, ready to fight'" +
                    " but as the killer steps into view, he mutters words that make no sense... " +
                    " and your weapon explodes into splinters without being touched.";
            case 5 -> "'I trace the scratching... could someone be trapped?' " +
                    " Peeling back the wallpaper reveals a hollow space- " +
                    " and inside, a journal bearing your name, gouged into the leather as if by a knife.";
            case 6 -> "'I let out a decoy scream and slip into the wardrobe, certain I've tricked him...' " +
                    " The moment the door clicks shut, moist air grazes your skin— You're not alone in here.";
            default -> "";
        };
        System.out.println(answer);
    }
}
