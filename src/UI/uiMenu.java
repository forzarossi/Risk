package UI;

import coreElements.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by marcrossi on 8/14/17.
 */
public class uiMenu extends JPanel {
    JButton Sigil;
    JButton hourGlass;
    Image background;
    Image glass;
    Image coin;
    Player user;
    boolean multiplayer = false;

    public uiMenu(Player u){
        user = u;

        try {
            background = ImageIO.read(new File("resources/backgrounds/uimenubackground.jpg"));
            glass = ImageIO.read(new File("resources/uiMenu/timer.png"));
            coin = ImageIO.read(new File("resources/uiMenu/coin.png"));
        }catch(Exception e){
            System.out.println("uibackground");
        }
       // repaint();
    }

    private void buttons(){
        Sigil = new JButton();
        Sigil.setIcon(new ImageIcon(user.getHouse().getSigil()));
        Sigil.setPreferredSize(new Dimension(100, 120));
        Sigil.setBorderPainted(false);
        Sigil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        setLayout(null);
        Sigil.setBounds(1075,90,100,120);

        hourGlass = new JButton();
        hourGlass.setIcon(new ImageIcon(glass));
        hourGlass.setPreferredSize(new Dimension(100, 120));
        hourGlass.setBorderPainted(false);
        hourGlass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                endTurn();
            }
        });
        setLayout(null);
        hourGlass.setBounds(1075,-10,100,120);

        
        add(hourGlass);
        add(Sigil);
    }

    private void endTurn() {
        if(multiplayer){

        }else{
            //TODO make turns i guess
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background,0,0,null);
        g.setColor(Color.white);
        g.drawImage(coin, 118 ,167 , null);
        g.drawString(String.valueOf(user.getMoney()),80,190);
        buttons();
    }
}
