package UI;

import coreElements.map;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by marcrossi on 8/1/17.
 */
public class uiMap extends JPanel{
    private BufferedImage map;
    map Westros = new map();

    public uiMap(map westros) {
        setSize(1200,750);
        setVisible(true);

        Westros = westros;

        try {
            map = ImageIO.read(new File("westros.jpg"));
        } catch (IOException ex) {
            System.out.print("westros cannot be found");
        }
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Westros.getY() >= 0){
            Westros.setY(0);
        }

        if(Westros.getY() < -1365){
            Westros.setY(-1365);
        }

        g.drawImage(map,0, Westros.getY(),null);
    }
}
