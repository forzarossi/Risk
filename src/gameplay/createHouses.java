package gameplay;

import coreElements.house;
import coreElements.region;

import javax.imageio.ImageIO;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by marcrossi on 8/24/17.
 */
public class createHouses {
    ArrayList<region> allRegions;

    public createHouses(){
        allRegions = new ArrayList<region>();
    }

    public house createStark(){
        String sigil = "stark.png";
        String[] family = {"Robb Stark, John Snow, Aria Stark, Sansa Stark"};
        String name = "Stark";
        String Color = "white";
        ArrayList<region> sr = new ArrayList<region>();
        region capital = null;

        try {
            capital = new region("Winterfell", 15, Arrays.asList(3, 4, 11), 300, Color, ImageIO.read(new File("resources/regions/winterfell.png")),196,69);

            sr.add(capital);
            sr.add(new region("Stoney Shore", 15, Arrays.asList(1, 2), 50, Color, ImageIO.read(new File("resources/regions/stoneyshore.png")),7,141));
            sr.add(new region("Bear Island", 15, Arrays.asList(1, 3), 50, Color, ImageIO.read(new File("resources/regions/bearisland.png")),129,93));
            sr.add(new region("Wolfswood", 15, Arrays.asList(1, 2, 3), 30, Color, ImageIO.read(new File("resources/regions/wolfswood.png")),108,137));
            sr.add(new region("Barrowlands", 15, Arrays.asList(2, 3, 10), 30, Color, ImageIO.read(new File("resources/regions/barrowlands.png")),89,245));
            sr.add(new region("The Gift", 15, Arrays.asList(4, 6, 7), 100, Color, ImageIO.read(new File("resources/regions/thegift.png")),263,36));
            sr.add(new region("The Dreadfort", 15, Arrays.asList(4, 7, 8), 100, Color, ImageIO.read(new File("resources/regions/thedreadfort.png")),342,116));
            sr.add(new region("Skagos", 15, Arrays.asList(6), 30, Color, ImageIO.read(new File("resources/regions/skagos.png")),470,1));
            sr.add(new region("Karnold", 15, Arrays.asList(5, 6, 7), 100, Color, ImageIO.read(new File("resources/regions/karnold.png")),382,91));
            sr.add(new region("Widow's watch", 15, Arrays.asList(4, 8, 9), 50, Color, ImageIO.read(new File("resources/regions/widowswatch.png")),356,222));
            sr.add(new region("white Harbor", 15, Arrays.asList(9, 10, 11), 200, Color, ImageIO.read(new File("resources/regions/whiteharbor.png")), 272,294));
            sr.add(new region("The Neck", 15, Arrays.asList(10, 11, 12), 100, Color, ImageIO.read(new File("resources/regions/theneck.png")),153,375));
            sr.add(new region("Cape Kraken", 15, Arrays.asList(11), 100, Color, ImageIO.read(new File("resources/regions/capekraken.png")),10 ,390));
        }catch (Exception e){
            System.out.println("Stark regions");
        }

        allRegions.addAll(sr);
        return new house(name, Color,sigil, family, capital, sr);
    }

    public house createLannister(){
        String sigil = "lan.png";
        String[] family = {"Jamie Lannister, Cerci Lannister, Gregor Clegane, Sandor Clegane"};
        String name = "Lannister";
        String Color = "red";
        ArrayList<region> sr = new ArrayList<region>();
        region capital = null;

        try {
            capital = new region("Casterly Rock", 15, Arrays.asList(19, 21), 30, Color, ImageIO.read(new File("resources/regions/casterlyrock.png")),18,659);

            sr.add(capital);
            sr.add(new region("The Crag", 15, Arrays.asList(15, 19), 50,Color, ImageIO.read(new File("resources/regions/thecrag.png")),85,580));
            sr.add(new region("Golden Tooth", 15, Arrays.asList(19, 20), 50, Color, ImageIO.read(new File("resources/regions/goldentooth.png")),119,620));
            sr.add(new region("Crackerhall", 15, Arrays.asList(21, 37), 30, Color, ImageIO.read(new File("resources/regions/crackerhill.png")),39,715));
            sr.add(new region("Siverhill", 15, Arrays.asList(21, 22, 37), 300, Color, ImageIO.read(new File("resources/regions/silverhill.png")),115,713));
        }catch (Exception e){
            System.out.println("Lan regions");
        }

        allRegions.addAll(sr);
        return new house(name, Color, sigil, family, capital, sr);
    }

    public house createGreyjoy(){
        String sigil = "greyjoy.png";
        String[] family = {"Euron Greyjoy","Theon Greyjoy","Asha Greyjoy","Balon Greyjoy"};
        String name = "Greyjoy";
        String Color = "brown";
        ArrayList<region> sr = new ArrayList<region>();
        region capital = null;

        try {
            capital = new region("Pyke", 15, Arrays.asList(15, 38), 50, Color, ImageIO.read(new File("resources/regions/pyke.png")),26,529);

            sr.add(capital);
            sr.add(new region("Harlaw", 15, Arrays.asList(12, 38), 50, Color, ImageIO.read(new File("resources/regions/harlaw.png")),77,520));
        }catch (Exception e){
            System.out.println("greyjoy regions");
        }

        allRegions.addAll(sr);
        return new house(name, Color, sigil, family, capital, sr);
    }

    public house createArryn(){
        String sigil = "arryan.png";
        String[] family = {"Robin Arryn","Yohn Royce","Lother Brune","Little Finger"};
        String name = "Arryn";
        String Color = "cyan";
        ArrayList<region> sr = new ArrayList<region>();
        region capital = null;

        try {
            capital = new region("The Eyrie", 15, Arrays.asList(17, 18), 30, Color, ImageIO.read(new File("resources/regions/eyrie.png")),389,482);

            sr.add(new region("The Fingers", 15, Arrays.asList(16), 50, Color, ImageIO.read(new File("resources/regions/fingers.png")),344,433));
            sr.add(new region("Mountians of the Moon", 15, Arrays.asList(13, 16, 17), 50, Color, ImageIO.read(new File("resources/regions/moon.png")),271,457));
            sr.add(new region("Gulltown", 15, Arrays.asList(18), 30, Color, ImageIO.read(new File("resources/regions/gulltown.png")),456,564));
            sr.add(capital);

        }catch (Exception e) {
            System.out.println("Arryn regions");
        }

        allRegions.addAll(sr);
        return new house(name, Color, sigil, family, capital, sr);
    }

    public house createBaratheon(){
        String sigil = "RBar.png";
        String[] family = {"Stannis Baratheon","Renly Baratheon", "Davos Seaworth", "Red Woman"};
        String name = "Baratheon";
        String Color = "yellow";
        ArrayList<region> sr = new ArrayList<region>();
        region capital = null;

        try {
            capital = new region("Strom's End", 15, Arrays.asList(27, 29, 30), 50, Color, ImageIO.read(new File("resources/regions/stormsend.png")),362,783);

            sr.add(capital);
            sr.add(new region("Dornish Marches", 15, Arrays.asList(34, 28, 29), 50, Color, ImageIO.read(new File("resources/regions/dornishmarch.png")),239,840));
            sr.add(new region("Rainwood", 15, Arrays.asList(29, 30), 30, Color, ImageIO.read(new File("resources/regions/rainwood.png")),392,863));
            sr.add(new region("Tarth", 15, Arrays.asList(30), 30, Color, ImageIO.read(new File("resources/regions/tarth.png")),518,818));
        }catch (Exception e){
            System.out.println("RBAR regions");
        }

        allRegions.addAll(sr);
        return new house(name, Color, sigil, family, capital, sr);
    }

    public house createMartell(){
        String sigil = "Martell.png";
        String[] family = {"Ellaria Sand","Tyana Sand","Nym Sand","Obara Sand"};
        String name = "Martell";
        String Color = "orange";
        ArrayList<region> sr = new ArrayList<region>();
        region capital = null;

        try {
            capital = new region("Sunspear", 15, Arrays.asList(36), 30, Color, ImageIO.read(new File("resources/regions/sunspear.png")),419,996);

            sr.add(capital);
            sr.add(new region("Red Mountians", 15, Arrays.asList(33, 34,35), 50,Color, ImageIO.read(new File("resources/regions/redmountians.png")),105,905));
            sr.add(new region("Sandstone", 15, Arrays.asList(35), 50, Color, ImageIO.read(new File("resources/regions/sandstone.png")),162,981));
            sr.add(new region("Greenblood", 15, Arrays.asList(35, 36), 30, Color, ImageIO.read(new File("resources/regions/greenblood.png")),256,982));
        }catch (Exception e){
            System.out.println("Martell regions");
        }

        allRegions.addAll(sr);
        return new house(name, Color, sigil, family, capital, sr);
    }

    public house createTrag(){
        String sigil = "targ.png";
        String[] family = {"","","",""};
        String name = "Targ";
        String Color = "black";
        ArrayList<region> sr = new ArrayList<region>();
        region capital = null;

        try {
            capital = new region("Dragonstone", 15, Arrays.asList(2, 3, 10), 30, Color, ImageIO.read(new File("resources/regions/dragonstone.png")),463,678);

            sr.add(capital);
            sr.add(new region("Kings Landing", 15, Arrays.asList(24, 25, 39), 50, Color, ImageIO.read(new File("resources/regions/kingslanding.png")),319,649));
            sr.add(new region("Crackclaw Point", 15, Arrays.asList(25,26), 50, Color, ImageIO.read(new File("resources/regions/crackclaw.png")),407,615));
            sr.add(new region("Kingswood", 15, Arrays.asList(26, 27, 40), 30, Color, ImageIO.read(new File("resources/regions/kingswood.png")),344, 715));
        }catch (Exception e){
            System.out.println("Targ regions");
        }

        allRegions.addAll(sr);
        return new house(name, Color, sigil, family, capital, sr);
    }

    public house createTully(){
        String sigil = "tully.png";
        String[] family = {"","","",""};
        String name = "Tully";
        String Color = "blue";
        ArrayList<region> sr = new ArrayList<region>();
        region capital = null;

        try {
            capital = new region("Riverrun", 15, Arrays.asList(14, 15, 41), 30, Color, ImageIO.read(new File("resources/regions/riverrun.png")),182,568);

            sr.add(capital);
            sr.add(new region("The Twins", 15, Arrays.asList(12, 13), 50, Color, ImageIO.read(new File("resources/regions/twins.png")), 168,460));
            sr.add(new region("The Trident", 15, Arrays.asList(13, 14), 50, Color, ImageIO.read(new File("resources/regions/trident.png")),224,521));
            sr.add(new region("Stoney Sept", 15, Arrays.asList(20, 22, 41), 30, Color, ImageIO.read(new File("resources/regions/stoneysept.png")),188,657));
            sr.add(new region("Harrenhal", 15, Arrays.asList(14,39, 41), 300, Color, ImageIO.read(new File("resources/regions/harrenhal.png")),266,613));
        }catch (Exception e){
            System.out.println("Tully regions");
        }

        allRegions.addAll(sr);
        return new house(name, Color, sigil, family, capital, sr);
    }

    public house createTyrell(){
        String sigil = "Tyrell.png";
        String[] family = {"Olenna Tyrell","Mace Tyrell","Brienne of Tarth", "Loras Tyrell"};
        String name = "Tyrell";
        String Color = "green";
        ArrayList<region> sr = new ArrayList<region>();
        region capital = null;

        try {
            capital = new region("Highgarden", 15, Arrays.asList(23, 31, 33, 28), 50, Color, ImageIO.read(new File("resources/regions/highgarden.png")),83,828);

            sr.add(capital);
            sr.add(new region("The Mander", 15, Arrays.asList(24, 28), 50, Color, ImageIO.read(new File("resources/regions/themander.png")),198,774));
            sr.add(new region("Blackwater Rush", 15, Arrays.asList( 22, 23, 24), 30, Color, ImageIO.read(new File("resources/regions/blackwater.png")),177, 694));
            sr.add(new region("Searoad Marches", 15, Arrays.asList(23, 37), 30, Color, ImageIO.read(new File("resources/regions/searoadmarch.png")),50,755));
            sr.add(new region("Oldtown", 15, Arrays.asList(31, 32), 300, Color, ImageIO.read(new File("resources/regions/oldtown.png")),15,890));
            sr.add(new region("Three Towers", 15, Arrays.asList(31,32, 33), 300, Color, ImageIO.read(new File("resources/regions/threetowers.png")),44,955));
            sr.add(new region("The Arbor", 15, Arrays.asList(32), 300, Color, ImageIO.read(new File("resources/regions/arbor.png")),0 , 1051));
        }catch (Exception e){
           System.out.println("Tyrell regions");
        }

        allRegions.addAll(sr);
        return new house(name, Color, sigil, family, capital, sr);
    }

    public ArrayList<region> getAllRegions(){
        return allRegions;
    }
}
