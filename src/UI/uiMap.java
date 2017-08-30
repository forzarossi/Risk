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
import java.io.IOException;
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
    Player[] ai;
    public int acceleration = 2;
    BufferedImage background;
    boolean list = false;
    int y;

    public uiMap(Player house) {
        user = house;
        iz = new initialize(this, house);
        ai = iz.getAi();
        regions = iz.getAllRegions();
        target = user.getRegions().get(0);
        selected = user.getRegions().get(0);

        try {
            background = ImageIO.read(new File("resources/backgrounds/ocean.jpg"));
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
        int i = 0;
        for(Player p: ai) {
            for(region k: p.getRegions()) {
                k.setX(k.getX() + 300);
                k.setY(k.getY() - (user.getHouse().getCapital().getY() - 300));
                k.addSigil(ai[i].getHouse().getSigil());

                BufferedImage shrunkSigil = getScaledImage(ai[i].getHouse().getSigil(), 15, 18);

                int w = Math.max(k.getImage().getWidth(), shrunkSigil.getWidth());
                int h = Math.max(k.getImage().getHeight(), shrunkSigil.getHeight());
                BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
                Graphics g = combined.getGraphics();

                g.drawImage(k.getImage(), 0, 0, null);
                g.drawImage(shrunkSigil, k.getImage().getWidth() / 2, k.getImage().getHeight() / 2, null);

                if(p.getHouse().getName() == "Stark" || p.getHouse().getName() == "Baratheon"||p.getHouse().getName() == "Arryn" || p.getHouse().getName() == "Tyrell"){
                    g.setColor(Color.black);
                }else{
                    g.setColor(Color.WHITE);
                }

                g.drawString(k.getName(),k.getImage().getWidth() / 4, k.getImage().getHeight() / 2);
                k.setImage(combined);
            }
            i++;
        }
    }

    public void createMap(Player user, AI[] ai) {
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

//        for (int x = 0; x < getWidth(); x += background.getWidth()) {
//            for (int y = 0; y < getHeight(); y += background.getHeight()) {  //TODO fix shitty background
//                g.drawImage(background, x, y, this);
//            }
//        }
        g.setColor(Color.BLUE);
        g.fillRect(0,0,1200,1500);

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

//        for(region k: regions){
//            for (region r: user.getRegions()) {
//                if(r.getName() == k.getName() || k.isAdjacent(selected)){
//                    list = true;
//                }
//            }
//
//            if(list){
//                g.setFont(new Font("TimesRoman", Font.BOLD, 30));
//                g.drawString(String.valueOf(k.getUnitsPresent()),k.getX()+30,k.getY()+30);
//                g.drawImage(user.getHouse().getSigil().getScaledInstance(25, 30, Image.SCALE_DEFAULT), k.getX()+30, k.getY()+30,null);
//                //TODO display accurately plz and on adjecent territories. Above is for mini sigils on terriroties
//            }
//
//            list = false;
//        }
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

    private BufferedImage getScaledImage(BufferedImage src, int w, int h){
        int finalw = w;
        int finalh = h;
        double factor = 1.0d;
        if(src.getWidth() > src.getHeight()){
            factor = ((double)src.getHeight()/(double)src.getWidth());
            finalh = (int)(finalw * factor);
        }else{
            factor = ((double)src.getWidth()/(double)src.getHeight());
            finalw = (int)(finalh * factor);
        }

        BufferedImage resizedImg = new BufferedImage(finalw, finalh, BufferedImage.TRANSLUCENT);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(src, 0, 0, finalw, finalh, null);
        g2.dispose();
        return resizedImg;
    }
}
