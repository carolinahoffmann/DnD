import java.util.*;

public class Scripts {
    Scanner scanner = new Scanner(System.in);
    public static void RollingDice(){

      Random random = new Random();
      int r1 = random.nextInt(6);

        System.out.println("Random number: " + r1);

        String antwort = "";

// DU BIST IM SCHLAFZIMMER; DER MÖRDER IST DIR AUF DER SCHLICHE: WÄHLE WEISE
        // WIE ENTSCHEIDES DU DICH?

        //NEBENNOTIZ: DOCH LIEBER AUSWAHLMÖGLICHKEITEN; STATT WÜRFEL?
switch (r1){
    case 1:
        antwort = "Deine Wahl ist aussichtslos, der Mörder kommt dir immer näher";
        System.out.println(antwort);
        break;
    case 2:
        antwort = "Deine Wahl war effektiv, du gelangst ins nächste Zimmer";
        System.out.println(antwort);
        break;
    case 3:
        antwort = "Dein Plan ist effektiv, der Mörder geht an dir vorbei";
        System.out.println(antwort);
        break;
    case 4:
        antwort = "Pls try agein";
        System.out.println(antwort);
        break;
    case 5:
        antwort = "bliblablub";
        System.out.println(antwort);
        break;
    case 6:
        antwort = "Bananenkuchen";
        System.out.println(antwort);
        break;
    }
}



    }



