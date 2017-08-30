package UI;

import music.sounds;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by marcrossi on 8/22/17.
 */
public class mainMenu extends JPanel{
    public Game game;
    sounds s = new sounds();
    Image background;
    Image title;
    Image plusplus;

    public mainMenu(Game gm) {
        game = gm;
        setVisible(true);
        createMenu();
        revalidate();
        repaint();
    }

    public void createMenu(){
        JButton start = new JButton();
        JButton settings = new JButton();
        JButton quit = new JButton();
        Thread t = new Thread(s);

        try {
            Image s = ImageIO.read(new File("resources/mainMenu/start.png"));
            Image ss = ImageIO.read(new File("resources/mainMenu/settings.png"));
            Image qq= ImageIO.read(new File("resources/mainMenu/quit.png"));
            start.setIcon(new ImageIcon(s));
            settings.setIcon(new ImageIcon(ss));
            quit.setIcon(new ImageIcon(qq));
        } catch (Exception e) {
            System.out.println("main menu.jpg");
        }
        setLayout(null);
        start.setPreferredSize(new Dimension(500, 120));
        start.setBorderPainted(false);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                game.loadHouseSelect(t);
            }
        });
        settings.setPreferredSize(new Dimension(500, 120));
        settings.setBorderPainted(false);
        settings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        quit.setPreferredSize(new Dimension(500, 120));
        quit.setBorderPainted(false);
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(start);
        add(settings);
        add(quit);
        start.setBounds(40,200,500,120);
        settings.setBounds(30,280,500,90);
        quit.setBounds(30,340,500,90);
        t.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            background = ImageIO.read(new File("resources/backgrounds/background4.jpg"));
            title = ImageIO.read(new File("resources/mainMenu/title.png"));
            plusplus = ImageIO.read(new File("resources/mainMenu/++.png"));
        } catch (Exception e) {
            System.out.println(e);
        }

        g.drawImage(background, 0, 0, null);
        g.drawImage(title, 10,0, null);
        //g.drawImage(plusplus,600,150,null);
    }
}