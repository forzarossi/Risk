package coreElements;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.util.*;

/**
 * Created by marcrossi on 8/24/17.
 */
public class house {
    String name;
    String Color;
    Image sigil;
    String[] family;
    ArrayList<region> startingRegions;

    public house(String Na, String c, String sig, String[] fam, ArrayList<region> r){
        name = Na;
        Color = c;
        try {
          sigil = ImageIO.read(new File("resources/sigils/"+sig));
        }
        catch (Exception e){
            System.out.println("Sigil could not be found");
        }
        family = fam;
        startingRegions = r;
    }

    public String getName(){
        return name;
    }

    public Image getSigil(){
        return sigil;
    }

    public String[] getFamily(){
        return family;
    }

    public void setFamily(String[] fam){
        family = fam;
    }
}
