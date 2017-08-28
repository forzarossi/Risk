package coreElements;

import java.util.ArrayList;
import java.util.List;

public class Player {
    int playerNumber;
    int numberOfregions;
    house house;
    String name;
    List<region> regions;
    int money;

    public Player(String n, house h, int pn, int nor, int m) {
        name = n;
        playerNumber = pn;
        numberOfregions = nor;
        house = h;
        regions = house.getStartingRegions();
        money = m;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int m){
        money = m;
    }

    public void addMoney(int m){
        money += m;
    }

    public void loseMoney(int m){
        money -= m;
    }

    public house getHouse(){
        return house;
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

    public void setRegions(ArrayList<region> r){
        regions = r;
    }

    public void addRegion(region r){
        regions.add(r);
    }

    public void loseRegion(region r){
        regions.remove(r);
    }

    public List<region> getRegions() {
        return regions;
    }
}