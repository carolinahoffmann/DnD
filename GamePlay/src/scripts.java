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
            int tries = 0;
            int maxTries = 3;

            while (tries < maxTries){
                String user = scanner.nextLine().toLowerCase().trim();
                if (user.contentEquals("hunter")) {
                    new gameSettings().jsonHunterSettings();
                    new scripts().characterHunterScript();
                    break;
                } else if (user.contentEquals("hunted")) {
                    new gameSettings().jsonHuntedSettings();
                    new scripts().characterHuntedScript();
                    break;
                }else {
                    System.out.println("Try again.\nHunter or hunted?");
                    tries++;
                }
            }
            scanner.close();
            if (tries == maxTries) {
                throw new IllegalArgumentException("Game over...");
            }
        }
        public void characterHunterScript() {
            System.out.println("Who are you gonna be, choose wisely \nPick a character by entering their number");
            Scanner scanner = new Scanner(System.in);
            String user2 = scanner.nextLine();

            while (user2.contentEquals("1")){
            return ;
            }
            switch (user2){
                case "1":
                    new scripts().startGameScriptHunter();
                break;
                case "2":
                    new scripts().startGameScriptHunter();
                break;
                default: System.out.println("bla");

                };
            System.out.println(user2);
        }

    //later, that the text is written like a typewriter


        public void characterHuntedScript() {
            System.out.println("Who are you gonna be, choose wisely \nPick a character by entering their number");
            Scanner scanner = new Scanner(System.in);
            String user2 = scanner.nextLine();

            switch (user2){
                case "1":
                    break;
            }
        }


        private void startGameScriptHunted() {
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

        private void startGameScriptHunter(){
            System.out.println("17 Ravenscroft Lane. Come alone. Sent.\n" +
                    "\n" +
                    "Now we wait. I watch the screen, the glow painting my knuckles white. It isn't the most elegant plan. A mysterious text? A bit cliché. But it's the only play. He's cautious, paranoid. Without the bait of his friend, he'd never take the hook.\n" +
                    "\n" +
                    "My phone vibrates. The audio feed from Mark's car erupts with his excited, stupid voice. \"Seventeen Ravenscroft Lane! I got it too!\"\n" +
                    "\n" +
                    "A smile touches my lips. Perfect. The herd animal, leading the predator right to its heart.\n" +
                    "\n" +
                    "I listen as my target tries to warn him, his voice tight with fear. Good. Let him be afraid. Let him rush. Fear makes you sloppy.\n" +
                    "\n" +
                    "The engine roars in the feed. He's moving. The game is on.");


        }
    }




