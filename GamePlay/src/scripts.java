package GamePlay.src;

public class scripts {

    public void generatingResponse(){
            //NEBENNOTIZ: ENTSCHEIDUNGSPUNKT WIRD GEWÜRFELT UND GESCHICHTE WIRD DAMIT WEITERERZÄHLT

        rollingDice myDice = new rollingDice();
        int randomNumber = myDice.rollDice();
        String answer = switch (randomNumber) {
            case 1 -> "'I run down to the basement—maybe there’s a hiding spot or an exit'" +
                    "but what awaits you below isn’t escape. Instead, a room filled with old, bloody shackles... " +
                    "and something stirs in the shadows";
            case 2 -> "'I rush into the bathroom and shove the cabinet against the door!'" +
                    "But as you turn around, you see a second figure in the mirror—standing right behind you, " +
                    "even though no one is there.";
            case 3 -> "'I freeze and listen... Maybe it's just a rat?'" +
                    "The scratching grows louder—then a bloody hand bursts through the wall and grabs your arm!";
            case 4 -> "'I clutch the jagged remains of a bottle, ready to fight'" +
                    "but as the killer steps into view, he mutters words that make no sense... " +
                    "and your weapon explodes into splinters without being touched.";
            case 5 -> "'I trace the scratching... could someone be trapped?' " +
                    "Peeling back the wallpaper reveals a hollow space- " +
                    "and inside, a journal bearing your name, gouged into the leather as if by a knife.";
            case 6 -> "'I let out a decoy scream and slip into the wardrobe, certain I've tricked him...' " +
                    "The moment the door clicks shut, moist air grazes your skin— You're not alone in here.";
            default -> "";
        };
        System.out.println(answer);
        }





    }



