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
        ArrayList<region> sr = new ArrayList<region>();

        sr.add(new region("Winterfell", 15, Arrays.asList(1), 300));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));
        sr.add(new region("Winterfell", 15, Arrays.asList(1)));

        return new house(sigil,name,family, sr);
    }

    public house createLannister(){
        String sigil = "lan.png";
        String[] family = {"Jamie Lannister, Cerci Lannister, Gregor Clegane, Sandor Clegane"};
        String name = "Lannister";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(sigil,name,family,sr);
    }

    public house createGreyjoy(){
        String sigil = "greyjoy.png";
        String[] family = {"Euron Greyjoy","Theon Greyjoy","Asha Greyjoy","Balon Greyjoy"};
        String name = "Greyjoy";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(sigil,name,family,sr);
    }

    public house createArryan(){
        String sigil = "arryan.png";
        String[] family = {"Robin Arryn","Yohn Royce","Lother Brune","Little Finger"};
        String name = "Arryn";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(sigil,name,family,sr);
    }

    public house createBaratheon(){
        String sigil = "RBar.png";
        String[] family = {"Stannis Baratheon","Renly Baratheon", "Davos Seaworth", "Red Woman"};
        String name = "Baratheon";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(sigil,name,family,sr);
    }

    public house createMartell(){
        String sigil = "Martell.png";
        String[] family = {"Arianne Martell", "","",""};
        String name = "Martell";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(sigil,name,family,sr);
    }

    public house createTrag(){
        String sigil = "targ.png";
        String[] family = {"","","",""};
        String name = "Targaryen";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(sigil,name,family,sr);
    }

    public house createTully(){
        String sigil = "tully.png";
        String[] family = {"Ellaria Sand","Tyana Sand","Nym Sand","Obara Sand"};
        String name = "Tully";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(sigil,name,family,sr);
    }

    public house createTyrell(){
        String sigil = "Tyrell.png";
        String[] family = {"Olenna Tyrell","Mace Tyrell","Brienne of Tarth", "Loras Tyrell"};
        String name = "Tyrell";
        ArrayList<region> sr = new ArrayList<region>();

        return new house(sigil,name,family,sr);
    }
}
