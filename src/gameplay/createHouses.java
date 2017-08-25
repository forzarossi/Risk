package gameplay;

import coreElements.house;
import coreElements.region;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by marcrossi on 8/24/17.
 */
public class createHouses {
    public createHouses(){

    }

    public house createStark(){
        String sigil = "stark.png";
        String[] family = {"Robb Stark, John Snow, Aria Stark, Sansa Stark"};
        String name = "Stark";
        String Color = "white";
        ArrayList<region> sr = new ArrayList<region>();

        try {
            sr.add(new region("Stoney Shore", 15, Arrays.asList(1, 2), 50, Color));
            sr.add(new region("Bear Island", 15, Arrays.asList(1, 3), 50, Color));
            sr.add(new region("Wolfswood", 15, Arrays.asList(1, 2, 3), 30, Color));
            sr.add(new region("Barrowlands", 15, Arrays.asList(2, 3, 10), 30, Color));
            sr.add(new region("Winterfell", 15, Arrays.asList(3, 4, 11), 300, Color));
            sr.add(new region("The Gift", 15, Arrays.asList(4, 6, 7), 100, Color));
            sr.add(new region("The Dreadfort", 15, Arrays.asList(4, 7, 8), 100, Color));
            sr.add(new region("Skagos", 15, Arrays.asList(6), 30, Color));
            sr.add(new region("Karnold", 15, Arrays.asList(5, 6, 7), 100, Color));
            sr.add(new region("Widow's watch", 15, Arrays.asList(4, 8, 9), 50, Color));
            sr.add(new region("white Harbor", 15, Arrays.asList(9, 10, 11), 200, Color));
            sr.add(new region("The Neck", 15, Arrays.asList(10, 11), 100, Color));
            sr.add(new region("Cape Kraken", 15, Arrays.asList(11), 100, Color));
        }catch (Exception e){

        }

        return new house(name, Color,sigil, family, sr);
    }

    public house createLannister(){
        String sigil = "lan.png";
        String[] family = {"Jamie Lannister, Cerci Lannister, Gregor Clegane, Sandor Clegane"};
        String name = "Lannister";
        String Color = "red";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(name, Color, sigil, family, sr);
    }

    public house createGreyjoy(){
        String sigil = "greyjoy.png";
        String[] family = {"Euron Greyjoy","Theon Greyjoy","Asha Greyjoy","Balon Greyjoy"};
        String name = "Greyjoy";
        String Color = "brown";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(name, Color, sigil, family, sr);
    }

    public house createArryn(){
        String sigil = "arryan.png";
        String[] family = {"Robin Arryn","Yohn Royce","Lother Brune","Little Finger"};
        String name = "Arryn";
        String Color = "cyan";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(name, Color, sigil, family, sr);
    }

    public house createBaratheon(){
        String sigil = "RBar.png";
        String[] family = {"Stannis Baratheon","Renly Baratheon", "Davos Seaworth", "Red Woman"};
        String name = "Baratheon";
        String Color = "yellow";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(name, Color, sigil, family, sr);
    }

    public house createMartell(){
        String sigil = "Martell.png";
        String[] family = {"Arianne Martell", "","",""};
        String name = "Martell";
        String Color = "orange";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(name, Color, sigil, family, sr);
    }

    public house createTrag(){
        String sigil = "targ.png";
        String[] family = {"","","",""};
        String name = "Targaryen";
        String Color = "black";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(name, Color, sigil, family, sr);
    }

    public house createTully(){
        String sigil = "tully.png";
        String[] family = {"Ellaria Sand","Tyana Sand","Nym Sand","Obara Sand"};
        String name = "Tully";
        String Color = "blue";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(name, Color, sigil, family, sr);
    }

    public house createTyrell(){
        String sigil = "Tyrell.png";
        String[] family = {"Olenna Tyrell","Mace Tyrell","Brienne of Tarth", "Loras Tyrell"};
        String name = "Tyrell";
        String Color = "green";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(name, Color, sigil, family, sr);
    }
}
