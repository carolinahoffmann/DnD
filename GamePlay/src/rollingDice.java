package GamePlay.src;

import java.util.Random;


public class rollingDice {
    private Random random;

    public rollingDice() {

        random = new Random();
    }


    public int rollDice(){
        return random.nextInt(1,7);
    }

}
