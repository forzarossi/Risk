package coreElements;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;

/**
 * Created by marcrossi on 8/24/17.
 */
public class house {
    String name;
    String Color;
    BufferedImage sigil;
    String[] family;
    region capital;
    ArrayList<region> startingRegions;

    public house(String Na, String c, String sig, String[] fam, region cap, ArrayList<region> r){
        name = Na;
        Color = c;
        capital = cap;

        try {
            sigil = ImageIO.read(new File("resources/sigils/"+sig));
        }
        catch (Exception e){
            System.out.println("Sigil could not be found");
        }

        family = fam;
        startingRegions = r;
    }

    public region getCapital(){
        return capital;
    }

    public String getName(){
        return name;
    }

    public BufferedImage getSigil(){
        return sigil;
    }

    public String[] getFamily(){
        return family;
    }

    public void setFamily(String[] fam){
        family = fam;
    }

    public ArrayList<region> getStartingRegions(){
        return startingRegions;
    }
}
