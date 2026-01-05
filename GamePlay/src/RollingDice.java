package GamePlay.src;

import java.util.Random;


public class RollingDice {
    private Random random;

    public RollingDice() {

        random = new Random();
    }


    public int rollDice(){
        return random.nextInt(1,15);
    }

    //public int rollDiceDecision(){
        //return random.nextInt(1,4);
    //}

}
