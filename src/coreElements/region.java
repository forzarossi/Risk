package coreElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by marcrossi on 8/14/17.
 */
public class region extends JButton implements ActionListener{
    int unitsPresent;
    String name;
    String Color;

    List<Integer> adjacent;
    boolean possession;
    int income;
    BufferedImage image;
    BufferedImage sigil;
    int x;
    int y;

    public region(String n, int up, List<Integer> adj, int in, String c, BufferedImage i, int x , int y) {
        name = n;
        unitsPresent = up;
        adjacent = adj;
        income = in;
        Color = c;
        image = i;
        this.x = x;
        this.y = y;

        setColor();
        setLocation(x, y);
        setSize(image.getWidth(), image.getHeight());
        setBorderPainted(false);
        setDisabledIcon(new ImageIcon(getImage())); //TODO disable?
        setSelectedIcon(new ImageIcon(getImage()));
        setIcon(new ImageIcon(getImage()));
    }

    public void setColor(){
        int rgb = 0;
        if(Color == "white") {
            rgb = new Color(255, 255, 255).getRGB();
        }else if (Color == "gray"){
            rgb = new Color(192, 192, 192).getRGB();
        }else if(Color == "red"){
            rgb = new Color(255, 51, 51).getRGB();
        }else if(Color == "brown"){
            rgb = new Color(153, 76, 0).getRGB();
        }else if(Color == "cyan"){
            rgb = new Color(0, 255, 255).getRGB();
        }else if(Color == "yellow"){
            rgb = new Color(255, 255, 102).getRGB();
        }else if(Color == "orange"){
            rgb = new Color(255, 153, 51).getRGB();
        }else if(Color == "black"){
            rgb = new Color(0, 0, 0).getRGB();
        }else if(Color == "blue"){
            rgb = new Color(0, 102, 255).getRGB();
        }else if(Color == "green"){
            rgb = new Color(0, 255, 128).getRGB();
        }

        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                if(image.getRGB(x, y) == -16776961){
                    image.setRGB(x, y, rgb);
                }
            }
        }
    }

    public void addSigil(BufferedImage k) {
        sigil = k;

    }

    public int getX(){
        return x;
    }

    public void setX(int x1){
        setLocation(x1, y);
        x = x1;
    }

    public int getY(){
        return y;
    }

    public void setY(int y1){
        setLocation(x, y1);
        y = y1;
    }

    public void setColor(String c){
        Color = c;
    }

    public String getColor(){
        return Color;
    }

    public void setUnitsPresent(int up){
        unitsPresent = up;
    }public int getUnitsPresent(){ return unitsPresent; }

    public String getName(){
        return name;
    }

    public void Clickable(){
        setEnabled(true);
    }

    public void notClickable(){
        setEnabled(false);
    }

    public void setImage(BufferedImage i){
        image = i;
        setDisabledIcon(new ImageIcon(getImage())); //TODO disable?
        setSelectedIcon(new ImageIcon(getImage()));
        setIcon(new ImageIcon(getImage()));
        setColor();
    }

    public BufferedImage getImage(){
        return image;
    }

    public boolean isAdjacent(region attacker){
        for(int i : this.adjacent) {
            if(attacker.adjacent.contains(i)){
                    return true;
            }
        }
        return false;
    }

    public void defend(region attacker, int howManyBattles){
        if(!this.isAdjacent(attacker)){
         return;
        }
        possession = false;
        while(howManyBattles > 0  && possession == false) {
            switch (attacker.unitsPresent) {
                case 1: break;
                case 2:
                    switch (unitsPresent) {
                        case 1:
                            compareDie(attacker, 1, 1);
                            break;
                        default:
                            compareDie(attacker, 1, 2);
                            break;
                    }
                    break;
                case 3:
                    switch (unitsPresent) {
                        case 1:
                            compareDie(attacker, 2, 1);
                            break;
                        default:
                            compareDie(attacker, 2, 2);
                            break;
                    }
                    break;
                default:
                    switch (unitsPresent) {
                        case 1:
                            compareDie(attacker, 3, 1);
                            break;
                        default:
                            compareDie(attacker, 3, 2);
                            break;
                    }
                    break;
            }
            howManyBattles--;
        }
        return;
    }

    public void compareDie(region attacker, int attackNumber, int defendNumber) {
        Random random = new Random();

        Integer[] attackArray = new Integer[attackNumber];
        Integer[] defendArray = new Integer[defendNumber];

        for(int i = 0; i < attackNumber; i++){
            attackArray[i] = random.nextInt(6) + 1;
        }

        for(int i = 0; i < defendNumber; i++){
            defendArray[i] = random.nextInt(6) + 1;
        }

        Arrays.sort(attackArray);
        List<Integer> list = Arrays.asList(attackArray);
        Collections.reverse(list);
        attackArray = (Integer[]) list.toArray();

        Arrays.sort(defendArray);
        List<Integer> list2 = Arrays.asList(defendArray);
        Collections.reverse(list2);
        defendArray = (Integer[]) list2.toArray();

        int i = 0;

        while(i < defendArray.length && i < attackArray.length){
            if(defendArray[i] >= attackArray[i]){
                attacker.unitsPresent -= 1;
                System.out.println("Defender rolls: " +defendArray[i] + " --- Attacker rolls: "+ attackArray[i] + ": Defender wins!");
            }else{
                this.unitsPresent -= 1;
                System.out.println("Defender rolls: " +defendArray[i] + " --- Attacker rolls: "+ attackArray[i] + ": Attcker wins!");
            }
            i++;
        }
        if(this.unitsPresent == 0){
            //changePossession(attacker);
            possession = true;
            return;
        }
    }

//    public void changePossession(region attacker){
//        System.out.println("The new owner of this coreElements.region is: "+ attacker.owner.name);
//        this.owner.loseRegion(this);
//        this.setOwner(attacker.owner);
//        attacker.owner.addRegion(this);
//        attacker.owner.numberOfregions++;
//        attacker.owner.canReinforce = true;
//        transferUnits();
//    }

    public void transferUnits(){
        //prompt user for number of unit to move into this new territory
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}