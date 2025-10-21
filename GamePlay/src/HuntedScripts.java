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
        System.out.println("Type 'start' to roll the dice...");
        new HuntedScripts().startFirstDecisionHunted();
    }

    private void startFirstDecisionHunted(){
        RollingDice myDice1 = new RollingDice();
        int randomNumber = myDice1.rollDiceDecision();
        String answer = switch (randomNumber) {
            case 1 -> "case1";
            case 2 -> "case2";
            case 3 -> "case3";
            default -> "";
        };
        System.out.println(answer);

        if(answer.contentEquals("case1")){
            new HuntedScripts().startFirstDecisionCase1();
        }else if(answer.contentEquals("case2")){
            new HuntedScripts().startFirstDecisionCase2();
        }else if(answer.contentEquals("case3"));{
            new HuntedScripts().startFirstDecisionCase3();
        }
    }

    private void startFirstDecisionCase1(){
        RollingDice myDice1 = new RollingDice();
        int randomNumber = myDice1.rollDiceDecision();
        String answer = switch (randomNumber) {
            case 1 -> "case1";
            case 2 -> "case2";
            case 3 -> "case3";
            default -> "";
        };
        System.out.println(answer);

        if(answer.contentEquals("case1")){

        }else if(answer.contentEquals("case2")){

        }else if(answer.contentEquals("case3"));{

        }
    }

    private void startFirstDecisionCase2(){
        RollingDice myDice1 = new RollingDice();
        int randomNumber = myDice1.rollDiceDecision();
        String answer = switch (randomNumber) {
            case 1 -> "case1";
            case 2 -> "case2";
            case 3 -> "case3";
            default -> "";
        };
        System.out.println(answer);

        if(answer.contentEquals("case1")){

        }else if(answer.contentEquals("case2")){

        }else if(answer.contentEquals("case3"));{

        }
    }

    private void startFirstDecisionCase3(){
        RollingDice myDice1 = new RollingDice();
        int randomNumber = myDice1.rollDiceDecision();
        String answer = switch (randomNumber) {
            case 1 -> "case1";
            case 2 -> "case2";
            case 3 -> "case3";
            default -> "";
        };
        System.out.println(answer);

        if(answer.contentEquals("case1")){

        }else if(answer.contentEquals("case2")){

        }else if(answer.contentEquals("case3"));{

        }
    }
}
