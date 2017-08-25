package gameplay;

import coreElements.Player;
import coreElements.region;

import java.util.ArrayList;

/**
 * Created by marcrossi on 8/24/17.
 */
public class initialize {
    createHouses ch;
    Player user;
    public initialize(String h){
        ch = new createHouses();
       if(h == "Stark"){
            user = new Player("Stark", ch.createStark(), 1,5, "white",false);
            user.setRegions(new ArrayList<region>());
       }
    }

}
