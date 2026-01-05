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
        System.out.println("Type 'start' to begin the game or 'end' to quit at any time.");

        Scanner scanner = new Scanner(System.in);
        String user2 = scanner.nextLine().toLowerCase().trim();
        if(user2.contentEquals("start")){
            new HuntedScripts().startFirstDecisionHunted();
        }
    }

    private void startFirstDecisionHunted(){

        RollingDice dice = new RollingDice();
        int rolledNumber = dice.rollDice();

        System.out.println("You rolled a: " + rolledNumber);

        HuntedSerializer serializer =
                new HuntedSerializer("Gameplay/src/huntedRooms.json");

        String chosenRoom = serializer.getRandomRoomByDice(rolledNumber);

        System.out.println("Next location: " + chosenRoom);

        generatingResponse2Hunted();

    }


    public void generatingResponse2Hunted() {
        RollingDice myDice = new RollingDice();
        int randomNumber = myDice.rollDice();
        String answer = switch (randomNumber) {
            case 1 -> "The ceiling creaks softly, as if someone shifted their weight above me. I hold my breath, knowing the house is no longer empty.";
            case 2 -> "The corridor feels too long, every door a watching eye. My footsteps sound louder than they should, betraying me.";
            case 3 -> "The living room looks untouched, almost welcoming, which makes it worse. Something has been waiting here longer than I have.";
            case 4 -> "A drawer is slightly open, as if someone closed it in a hurry. I don’t remember touching anything.";
            case 5 -> "Dust fills my lungs as I crouch between boxes. I hear a sound behind the door that doesn’t belong to the house.";
            case 6 -> "The bathroom light flickers, and for a moment I see movement that isn’t mine. I turn slowly, already knowing.";
            case 7 -> "The work room hums with quiet tension. I feel like I’ve interrupted something that hasn’t finished yet.";
            case 8 -> "The door clicks shut behind me, though I never touched it. The darkness presses in, heavy and deliberate.";
            case 9 -> "Halfway up the stairs, I feel exposed from every angle. Going back feels worse than going forward.";
            case 10 -> "Every door upstairs is closed, and I don’t know which one hides answers—or something else. The air feels watched.";
            case 11 -> "The children’s room feels wrong, frozen in time. I sense I’m not supposed to be here, yet I can’t leave.";
            case 12 -> "I lock the bedroom door and lean against it, heart racing. The handle moves anyway.";
            case 13 -> "The running tap can’t drown out the feeling that someone is close. I shut it off—and hear breathing.";
            case 14 -> "The wall gives way to a space that shouldn’t exist. As it closes behind me, I realize the house has one last secret.";
            default -> "";
        };
        System.out.println(answer);
    }
}
