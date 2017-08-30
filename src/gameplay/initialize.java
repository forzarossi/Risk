package gameplay;

import UI.uiMap;
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
    uiMap map;
    createHouses ch;
    Player user;
    AI[] ai;
    ArrayList<String> houses;

    public initialize(uiMap m, Player p){
        map = m;
        houses = new ArrayList<String>();
        ch = new createHouses();
        ai = new AI[9];

        houses.add("Stark");
        houses.add("Lannister");
        houses.add("Greyjoy");
        houses.add("Arryn");
        houses.add("Baratheon");
        houses.add("Martell");
        houses.add("Targ");
        houses.add("Tully");
        houses.add("Tyrell");

        createAI();
        load();
    }

    private void createAI() {
        int i = 0;

        if(houses.contains("Stark")){
             ai[i] = new AI("Stark", ch.createStark(), 1,13,1000);
             i++;
        }
        if(houses.contains("Lannister")) {
            ai[i] = new AI("Lannister", ch.createLannister(), 1, 13, 1000);
            i++;
        }
        if(houses.contains("Greyjoy")){
            ai[i] = new AI("Greyjoy", ch.createGreyjoy(), 1,13,1000);
            i++;
        }
        if(houses.contains("Arryn")){
           ai[i] = new AI("Arryn", ch.createArryn(), 1,13,1000);
            i++;
        }
        if(houses.contains("Baratheon")){
            ai[i] = new AI("Baratheon", ch.createBaratheon(), 1,13,1000);
            i++;
        }
        if(houses.contains("Martell")){
            ai[i] = new AI("Martell", ch.createMartell(), 1,13, 1000);
            i++;
        }
        if(houses.contains("Targ")){
            ai[i] = new AI("Targ", ch.createTrag(), 1,13,1000);
            i++;
        }
        if(houses.contains("Tully")) {
            ai[i] = new AI("Tully", ch.createTully(), 1, 13,1000);
            i++;
        }
        if(houses.contains("Tyrell")) {
            ai[i] = new AI("Tyrell", ch.createTyrell(), 1,13, 1000);
            i++;
        }
    }

    public ArrayList<region> getAllRegions(){
        return ch.getAllRegions();
    }

    public void load(){
        map.createMap(user, ai);
    }
}
