package UI;

import coreElements.AI;
import coreElements.Player;
import coreElements.region;
import gameplay.initialize;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

/**
 * Created by marcrossi on 8/1/17.
 */
public class uiMap extends JPanel implements KeyListener {
    initialize iz;
    ArrayList<region> regions;
    region selected;
    Image w;
    Player user;
    public int acceleration = 2;
    BufferedImage background;
    boolean list = false;

    public uiMap(Player house) {
        user = house;
        iz = new initialize(this, house);
        regions = iz.getAllRegions();
        selected = user.getRegions().get(0);

        try {
            background = ImageIO.read(new File("resources/backgrounds/download.jpg"));
             w = ImageIO.read(new File("resources/regions/westros.png"));
        }catch(Exception e){

        }

        //TODO clean this up please
        Action doNothing = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print("hi");
            }
        };
        getInputMap().put(KeyStroke.getKeyStroke("SPACE"),
                "doSomething");
        getActionMap().put("doSomething",
                doNothing);

        //TODO to here^^^

        setFocusable(true);
        addKeyListener(this);
        requestFocusInWindow();
        setLayout(null);
        repaint();
    }

    public void createMap(Player user, AI[] ai) {
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       // g.drawImage(w,0,0,null);
        for (int x = 0; x < getWidth(); x += background.getWidth()) {
            for (int y = 0; y < getHeight(); y += background.getHeight()) {  //TODO fix shitty background
                g.drawImage(background, x, y, this);
            }
        }

        for(region k: regions){
            for (region r: user.getRegions()) {
                if(r.getName() == k.getName() || k.isAdjacent(selected)){
                  list = true;
                }
            }
            if(!list){
                k.notClickable();
            }else{
                k.Clickable();
            }

            k.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(list){

                    }else {
                        selected = k;
                    }
                    repaint();
                }
            });
            add(k);

            if(list){
                g.drawString(String.valueOf(k.getUnitsPresent()),k.getX()+30,k.getY()+30);
                //TODO display accurately plz and on adjecent territories
            }

            list = false;
        }
        //g.drawImage(terrian,0,0,null);
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            //if(regions..getY() <= 0) {

                acceleration('y', '+');
                repaint();
            //}
        }

        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
           // if(westros.getY() >= -1365) {

                acceleration('y', '-');
                repaint();
            //}
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {;
            acceleration = 2;
        }
        if(key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {;
            acceleration = 2;
        }
    }

    public void acceleration(char XorY, char MinusorPlus) {
        if (XorY == 'y' && MinusorPlus == '+') {
            regions.forEach(region -> {region.setY(region.getY()+ acceleration);});
            regions.forEach(region -> {region.setY(region.getY()+ acceleration);});
           // regions.forEach(region -> {region.setY(region.getY()+ accelerationValue());});
        }

        if (XorY == 'y' && MinusorPlus == '-') {
            regions.forEach(region -> {region.setY(region.getY()- acceleration);});
           // regions.forEach(region -> {region.setY(region.getY()- accelerationValue());});
        }
    }

    public int accelerationValue() {
        acceleration = (int) (acceleration * 1.5);
        return acceleration;
    }
}
