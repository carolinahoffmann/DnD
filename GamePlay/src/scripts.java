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
            String user = scanner.nextLine();

            String userAnswer = switch (user) {
                case "hunter" -> "The quarry is in sight. Prepare to engage.\nChoose a character: ";
                case "Hunter" -> "The quarry is in sight. Prepare to engage.\nChoose your character ";
                case "hunted" -> "The murderer lies in wait. Get ready.\nChoose your character";
                case "Hunted" -> "The murderer lies in wait. Get ready. \nChoose your character";
                default -> "";
            };
            System.out.println(userAnswer);
            //block if user makes a typo (3times??)
            //if 3rd time wrong, throw exception (For schleife)
            if (user.contentEquals("hunter")){
                new gameSettings().jsonHunterSettings();
                new scripts().characterHunterScript();

            } else if (user.contentEquals("Hunter")) {
                new gameSettings().jsonHunterSettings();
                new scripts().characterHunterScript();

            } else if (user.contentEquals("hunted")) {
                new gameSettings().jsonHuntedSettings();
                new scripts().characterHuntedScript();

            }else if (user.contentEquals("Hunted")){
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

    
        public void characterHuntedScript() {
            System.out.println("Who are you gonna be, choose wisely \nPick a character by entering their number");
            Scanner scanner = new Scanner(System.in);
            String user2 = scanner.nextLine();

            switch (user2){
                case "1":
                    System.out.println("testtest");
                    break;
            }
        }


        private void startGameScript() {

        }
    }




