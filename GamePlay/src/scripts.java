package GamePlay.src;

import java.util.Scanner;

public class scripts {

    public void generatingResponse(){
            //NEBENNOTIZ: ENTSCHEIDUNGSPUNKT WIRD GEWÜRFELT UND GESCHICHTE WIRD DAMIT WEITERERZÄHLT

        rollingDice myDice = new rollingDice();
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


        public void startScript() {
            Scanner scanner = new Scanner(System.in);
            String user = scanner.nextLine().toLowerCase().trim();

            String userAnswer = switch (user) {
                case "hunter" -> "The quarry is in sight. Prepare to engage.\nChoose a character: ";
                case "hunted" -> "The murderer lies in wait. Get ready.\nChoose your character";

                default -> "";
            };
            System.out.println(userAnswer);
            //block if user makes a typo (3times??)
            //if 3rd time wrong, throw exception (For schleife)
            if (user.contentEquals("hunter")){
                new gameSettings().jsonHunterSettings();
                new scripts().characterHunterScript();

            } else if (user.contentEquals("hunted")) {
                new gameSettings().jsonHuntedSettings();
                new scripts().characterHuntedScript();
            }
        }
        public void characterHunterScript() {
            System.out.println("Who are you gonna be, choose wisely \nPick a character by entering their number");
            Scanner scanner = new Scanner(System.in);
            String user2 = scanner.nextLine();

            switch (user2){
                case "1":
                    System.out.println("Good choice... Let the Game begin");
                    new scripts().startGameScript();
                    break;
                case "2":
                    System.out.println("blablabla");
                    break;
                default:
                    System.out.println("bla");
            };
            System.out.println(user2);
        }

    // Hunter starts in the house, with a dead body in front of it. But the victim let out a cry. Hide and wait for your next prey...
    // Hunted starts outside. He got a message from an old friend, to meet him here, but he is nowhere to find. Did you hear it.. Could it be him??
    // You need to look, or do you? Choose from (blablabla)


    //later, that the text is written like a typewriter


        public void characterHuntedScript() {
            System.out.println("Who are you gonna be, choose wisely \nPick a character by entering their number");
            Scanner scanner = new Scanner(System.in);
            String user2 = scanner.nextLine();

            switch (user2){
                case "1":
                    new scripts().startGameScript();
                    break;
            }
        }


        private void startGameScript() {
            System.out.println("Your phone buzzes violently in your pocket, shattering the quiet of your evening. It’s a single text message from an unknown number. No greeting, no explanation. Just an address.\n" +
                    "\n" +
                    "UNKNOWN NUMBER: 17 Ravenscroft Lane. Come alone.\n" +
                    "\n" +
                    "A cold knot forms in your stomach. Before the panic can fully take hold, your phone rings. It’s your friend, Mark.\n" +
                    "\n" +
                    "\"Hey,\" you answer, your voice tense. \"You are not going to believe what I just—\"\n" +
                    "\n" +
                    "\"Seventeen Ravenscroft Lane,\" Mark interrupts, his words coming in a rushed, excited gasp. \"I got it too. What the hell is this? Some kind of prank?\"\n" +
                    "\n" +
                    "You can hear the rumble of his car engine in the background. Your blood runs cold.\n" +
                    "\n" +
                    "\"Wait, you're going now? Mark, don't be stupid, we don't know what this is!\"\n" +
                    "\n" +
                    "\"Are you kidding? This is the most interesting thing that's happened all year! I'm already on my way. Meet me there. We'll figure it out together.\"\n" +
                    "\n" +
                    "The line goes dead.\n" +
                    "\n" +
                    "You hurry, pushing your car well past the speed limit, a sense of dread growing with every mile. The address leads you to a dilapidated house at the end of a long, deserted lane, shrouded in mist. You are late.\n" +
                    "\n" +
                    "The scene is wrong. Deeply wrong.\n" +
                    "No cars are in sight. Not even Mark's. There are no people, and the nearest neighbor is nowhere visible. An oppressive silence hangs over everything, broken only by the wind.\n" +
                    "\n" +
                    "Then, a single, piercing scream cuts through the air from inside the house. The front door hangs open, a dark mouth inviting you in.\n" +
                    "\n" +
                    "Your heart hammers against your ribs. As you approach, your eyes catch a glimpse of something in the dim hallway through the open door. An arm. Limp. Motionless.\n" +
                    "\n" +
                    "But it’s the watch on the wrist that makes your breath catch in your throat. You know that watch. You gave it to Mark for his birthday.\n" +
                    "\n" +
                    "What do you do?");
        }
    }




