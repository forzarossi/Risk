package UI;

import coreElements.AI;
import coreElements.Player;
import coreElements.map;
import coreElements.region;
import gameplay.initialize;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by marcrossi on 8/1/17.
 */
public class uiMap extends JPanel{
    private BufferedImage map;
    initialize iz;
    region r;
    map Westros = new map();

    public uiMap(map westros, String house, String players) {
        iz = new initialize(this, house);
        setSize(1200,750);
        setVisible(true);

        Westros = westros;

       // terrian();
        repaint();
    }

    public void createMap(Player user, AI[] ai) {

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Westros.getY() >= 0){
            Westros.setY(0);
        }

        if(Westros.getY() < -1365){
            Westros.setY(-1365);
        }

        g.drawImage(r.getImage(),0, 0,null);
    }
}
