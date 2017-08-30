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
    region target;
    region selected;
    Image w;
    Player user;
    public int acceleration = 2;
    BufferedImage background;
    boolean list = false;
    int y;

    public uiMap(Player house) {
        user = house;
        System.out.println(user.getHouse().getName());
        iz = new initialize(this, house);
        regions = iz.getAllRegions();
        target = user.getRegions().get(0);
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
                regions.forEach(region -> {region.setY(region.getY()+ accelerationValue());});
            }
        };

        getInputMap().put(KeyStroke.getKeyStroke("S"), "doSomething");
        getActionMap().put("doSomething", doNothing);
        //TODO to here^^^

        requestFocusInWindow();
        addKeyListener(this);
        setLayout(null);
        center();
        repaint();
    }

    private void center() {
        for(region k: regions) {
            k.setX(k.getX() + 300);
            k.setY(k.getY() - (user.getHouse().getCapital().getY() - 200));
        }
    }

    public void createMap(Player user, AI[] ai) {
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

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
                   // k.setColor("gray");
                    if(!list){
                       selected = k;
                    }else{
                        target = k;
                    }
                    repaint();
                }
            });

            add(k);
            list = false;
        }

        for(region k: regions){
            for (region r: user.getRegions()) {
                if(r.getName() == k.getName() || k.isAdjacent(selected)){
                    list = true;
                }
            }

            if(list){
                g.setFont(new Font("TimesRoman", Font.BOLD, 30));
                g.drawString(String.valueOf(k.getUnitsPresent()),k.getX()+30,k.getY()+30);
                g.drawImage(user.getHouse().getSigil().getScaledInstance(25, 30, Image.SCALE_DEFAULT), k.getX()+30, k.getY()+30,null);
                //TODO display accurately plz and on adjecent territories. Above is for mini sigils on terriroties
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
            y+=30;
                repaint();
            //}
        }

        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
           // if(westros.getY() >= -1365) {
                acceleration('y', '-');
                y-=30;
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
            regions.forEach(region -> {region.setY(region.getY() + 30);});
           // regions.forEach(region -> {region.setY(region.getY()+ accelerationValue());});
        }

        if (XorY == 'y' && MinusorPlus == '-') {
            regions.forEach(region -> {region.setY(region.getY() - 30);});
           // regions.forEach(region -> {region.setY(region.getY()- accelerationValue());});
        }
    }

    public int accelerationValue() {
        acceleration = (int) (acceleration * 1.5);
        return acceleration;
    }
}
