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
            // ES SOLLEN NUR DIE NAMEN ANGEZEIGT WERDEN; DANN NOCHMAL DIE WAHL AUS VERSCHIEDENEN CHARACTERN GEBEN??
            //EINE METHODE IN SCRIPTS SCHREIBEN WEGEN DER IF ELSE UND CASE: DANN HIER AUF DIE METHODE VERWEISEN?
            // UND DANN NACH DER WAHL ZU HUNTER ODER HUNTED DANN FRAGEN WELCHEN CHARACTER ODER ZUFALLSPRINZIP??
            // UND DANN NACH DER WAHL/ ZUFALL DANN IN EINEM RAUM STARTEN ODER WO?

        }
    }




