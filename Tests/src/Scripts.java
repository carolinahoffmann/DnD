
public class Scripts {

    public void GeneratingResponse(){
            //NEBENNOTIZ: ENTSCHEIDUNGSPUNKT WIRD GEWÜRFELT UND GESCHICHTE WIRD DAMIT WEITERERZÄHLT

        RollingDice myDice = new RollingDice();
        int randomNumber = myDice.rollDice();
        String antwort = "";
            switch (randomNumber){
                case 1:
                    antwort = "'Ich renne in den Keller, vielleicht gibt es ein Versteck oder ein Ausgang'-" +
                            " doch unten erwartet dich kein Fluchtweg, sondern ein Raum vollre alter, blutiger Fesseln..." +
                            "und etwas bewegt sich im Schatten";
                    break;
                case 2:
                    antwort = "'Ich stürme ins Badezimmer und schiebe den Schrank vor die Tür!'" +
                            " Doch als du dich umdrehst, siehst du im Spiegel eine zweite Gestalt, sie steht direkt hinter dir," +
                            "obwohl niemand da ist";
                    break;
                case 3:
                    antwort = " 'Ich bleibe stehen und lausche... Vielleicht ist es nur eine Ratte?' " +
                            "Das Kratzen wird lauter, dann bricht eine blutige Hand durch die Wand und packt dich am Arm";

                    break;
                case 4:
                    antwort = "'Ich greife nach einem zerbrochenen Flaschenhals als Waffe und warte auf den Mörder!'" +
                            "Doch als er um die Ecke kommt, flüstert er was Unverständliches... und deine Waffe zersplitter von alleine...";

                    break;
                case 5:
                    antwort = "'Ich folge dem Kratzen... was, wenn jemand Hilfe braucht?'" +
                            "Hinter der Tapete findest du eine geheime Kammer... und ein Tagebuch mit deinem Namen" +
                            "reingeritzt in das Buchcover-";
                    break;
                case 6:
                    antwort = "'Ich täusche einen Schrei vor und verstecke mich im Schrank, um ihn zu überlisten'" +
                            "Doch als du die Tür schließt, spürst du einen warmen Atem im Nacken... Jemand ist schon hier";
                    break;
            }
        System.out.println(antwort);
        }





    }



