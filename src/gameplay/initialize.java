package gameplay;

import coreElements.AI;
import coreElements.Player;
import coreElements.region;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by marcrossi on 8/24/17.
 */
public class initialize {
    createHouses ch;
    Player user;
    AI[] ai;
    ArrayList<String> houses;

    public initialize(String h){
        houses = new ArrayList<String>();
        houses.add("Stark");
        houses.add("Lannister");
        houses.add("Greyjoy");
        houses.add("Arryn");
        houses.add("Baratheon");
        houses.add("Martell");
        houses.add("Targ");
        houses.add("Tully");
        houses.add("Tyrell");

        ch = new createHouses();
        ai = new AI[8];

        houses.remove(h);

        if(h == "Stark"){
            user = new Player("Stark", ch.createStark(), 1,13);
        }else if(h == "Lannister"){
            user = new Player("Lannister", ch.createLannister(), 1,5 );
        }else if(h == "Greyjoy"){
            user = new Player("Greyjoy", ch.createGreyjoy(), 1,5);
        }else if(h == "Arryn"){
            user = new Player("Arryn", ch.createArryn(), 1,5);
        }else if(h == "Baratheon"){
            user = new Player("Baratheon", ch.createBaratheon(), 1,5);
        }else if(h == "Martell"){
            user = new Player("Martell", ch.createMartell(), 1,5);
        }else if(h == "Targ"){
            user = new Player("Targ", ch.createTrag(), 1,5);
        }else if(h == "Tully"){
            user = new Player("Tully", ch.createTully(), 1,5);
        }else if(h == "Tyrell") {
            user = new Player("Tyrell", ch.createTyrell(), 1,5);
        }

        createAI();
        load();
    }

    private void createAI() {
        int i = 0;

        if(houses.contains("Stark")){
             ai[i] = new AI("Stark", ch.createStark(), 1,13);
             i++;
        }else if(houses.contains("Lannister")){
            ai[i] = new AI("Lannister", ch.createLannister(), 1,13);
            i++;
        }else if(houses.contains("Greyjoy")){
            ai[i] = new AI("Greyjoy", ch.createGreyjoy(), 1,13);
            i++;
        }else if(houses.contains("Arryn")){
            ai[i] = new AI("Arryn", ch.createArryn(), 1,13);
            i++;
        }else if(houses.contains("Baratheon")){
            ai[i] = new AI("Baratheon", ch.createBaratheon(), 1,13);
            i++;
        }else if(houses.contains("Martell")){
            ai[i] = new AI("Martell", ch.createMartell(), 1,13);
            i++;
        }else if(houses.contains("Targ")){
            ai[i] = new AI("Targ", ch.createTrag(), 1,13);
            i++;
        }else if(houses.contains("Tully")){
            ai[i] = new AI("Tully", ch.createTully(), 1,13);
            i++;
        }else if(houses.contains("Tyrell")) {
            ai[i] = new AI("Tyrell", ch.createTyrell(), 1,13);
            i++;
        }
    }

    public void load(){

    }
}
