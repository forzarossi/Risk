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
            user = new Player("Stark", ch.createStark(), 1,13,false);
        }else if(h == "Lannister"){
            user = new Player("Lannister", ch.createLannister(), 1,5 ,false);
        }else if(h == "Greyjoy"){
            user = new Player("Greyjoy", ch.createGreyjoy(), 1,5,false);
        }else if(h == "Arryn"){
            user = new Player("Arryn", ch.createArryn(), 1,5,false);
        }else if(h == "Baratheon"){
            user = new Player("Baratheon", ch.createBaratheon(), 1,5,false);
        }else if(h == "Martell"){
            user = new Player("Martell", ch.createMartell(), 1,5,false);
        }else if(h == "Targ"){
            user = new Player("Targ", ch.createTrag(), 1,5,false);
        }else if(h == "Tully"){
            user = new Player("Tully", ch.createTully(), 1,5,false);
        }else if(h == "Tyrell") {
            user = new Player("Tyrell", ch.createTyrell(), 1,5,false);
        }
        load();
    }


    public void load(){

    }
}
