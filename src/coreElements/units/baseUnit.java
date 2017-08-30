package coreElements.units;

import java.util.Random;

/**
 * Created by marcrossi on 8/28/17.
 */
public class baseUnit {
    int price;
    int diceRolled;
    int roll;

    baseUnit(int p, int d){
        price = p;
        diceRolled = d;
    }

    public int diceRoll(){
        Random rand = new Random();
        int  hit = rand.nextInt(diceRolled) + 1;
        hit = hit + modifier();
        return hit;
    }

    private int modifier() {
        return 0;
    }
}
