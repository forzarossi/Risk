package coreElements;

import java.util.ArrayList;
import java.util.List;

public class Player {
    int playerNumber;
    int numberOfregions;
    house house;
    String name;
    List<region> regions;

    boolean isAI;

    public Player(String n, house h, int pn, int nor, boolean a) {
        name = n;
        playerNumber = pn;
        numberOfregions = nor;
        isAI = a;
        house = h;
        regions = new ArrayList<region>();
    }

    public void setPlayerNumber(int pn){
        playerNumber = pn;
    }

    public int getPlayerNumber(){
        return playerNumber;
    }

    public void setNumberOfregions(int nor){
        numberOfregions = nor;
    }

    public int getNumberOfregions(){
        return numberOfregions;
    }

    public int getReinforcements(){
        return  (numberOfregions/3) + 3;
    }

    public void setAI(boolean A){
        isAI = A;
    }

    public boolean getAI(){
        return isAI;
    }

    public void setRegions(ArrayList<region> r){
        regions = r;
    }

    public void addRegion(region r){
        regions.add(r);
    }

    public void loseRegion(region r){
        regions.remove(r);
    }
}