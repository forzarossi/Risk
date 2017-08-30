package UI;

import coreElements.descriptions;
import music.playSelectNoise;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by marcrossi on 8/24/17.
 */

public class houseSelect extends JPanel {
    public Game game;
    public descriptions ds;
    JComboBox<String> jb;

    Image description;
    Image background;
    Image house;
    Image text;
    Image players;

    boolean confirmButton;
    boolean selectingHouse;
    boolean selected;

    String houseName;
    String houseDescription;
    String region;

    Thread music;

    public houseSelect(Game gm, Thread t) {
        game = gm;
        ds = new descriptions();
        selected = false;
        selectingHouse = true;
        confirmButton = false;
        music = t;
        repaint();
        addHouses();
    }

    public void addHouses() {
        JButton Lannister = new JButton();
        JButton Stark = new JButton();
        JButton RBaratheon = new JButton();
        JButton Martell = new JButton();
        JButton Tully = new JButton();
        JButton Arryn = new JButton();
        JButton Tyrell = new JButton();
        JButton Greyjoy = new JButton();
        JButton Targaryen = new JButton();
        //JButton Crown = new JButton();

        add(Box.createVerticalStrut(300));

        try {
            Image img = ImageIO.read(new File("resources/sigils/Stark.png"));
            Stark.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println(e);
        }

        Stark.setPreferredSize(new Dimension(100, 120));
        Stark.setBorderPainted(false);
        Stark.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                region = "resources/houseSelect/starkregion.png";
                houseName = "Stark";
                houseDescription = ds.stark();
                confirm();
            }
        });

        try {
            Image img = ImageIO.read(new File("resources/sigils/lan.png"));
            Lannister.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println("lan.jpg");
        }
        Lannister.setPreferredSize(new Dimension(100, 120));
        Lannister.setBorderPainted(false);
        Lannister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                region = "resources/houseSelect/lanregion.png";
                houseName = "Lannister";
                houseDescription = ds.Lannister();
                confirm();
            }
        });

        try {
            Image img = ImageIO.read(new File("resources/sigils/RBAR.png"));
            RBaratheon.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println("Rbar.jpg");
        }
        RBaratheon.setPreferredSize(new Dimension(100, 120));
        RBaratheon.setBorderPainted(false);
        RBaratheon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                region = "resources/houseSelect/barregion.png";
                houseName = "Baratheon";
                houseDescription = ds.RBaratheon();
                confirm();
            }
        });

        try {
            Image img = ImageIO.read(new File("resources/sigils/martell.png"));
            Martell.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println("martell.jpg");
        }
        Martell.setPreferredSize(new Dimension(100, 120));
        Martell.setBorderPainted(false);
        Martell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                region = "resources/houseSelect/martellregion.png";
                houseName = "Martell";
                houseDescription = ds.Martell();
                confirm();
            }
        });

        try {
            Image img = ImageIO.read(new File("resources/sigils/tully.png"));
            Tully.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println("tulley.jpg");
        }
        Tully.setPreferredSize(new Dimension(100, 120));
        Tully.setBorderPainted(false);
        Tully.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                region = "resources/houseSelect/tullyregion.png";
                houseName = "Tully";
                houseDescription = ds.Tully();
                confirm();
            }
        });

        try {
            Image img = ImageIO.read(new File("resources/sigils/arryan.png"));
            Arryn.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println("arryan.jpg");
        }
        Arryn.setPreferredSize(new Dimension(100, 120));
        Arryn.setBorderPainted(false);
        Arryn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                region = "resources/houseSelect/arryanregion.png";
                houseName = "Arryn";
                houseDescription = ds.Arryn();
                confirm();
            }
        });

        try {
            Image img = ImageIO.read(new File("resources/sigils/Tyrell.png"));
            Tyrell.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println("tyrell.jpg");
        }
        Tyrell.setPreferredSize(new Dimension(100, 120));
        Tyrell.setBorderPainted(false);
        Tyrell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                region = "resources/houseSelect/tyrellregion.png";
                houseName = "Tyrell";
                houseDescription = ds.Tyrell();
                confirm();
            }
        });

        try {
            Image img = ImageIO.read(new File("resources/sigils/greyjoy.png"));
            Greyjoy.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println("greyjoy.jpg");
        }
        Greyjoy.setPreferredSize(new Dimension(100, 120));
        Greyjoy.setBorderPainted(false);
        Greyjoy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                region = "resources/houseSelect/greyregion.png";
                houseName = "Greyjoy";
                houseDescription = ds.Greyjoy();
                confirm();
            }
        });

        try {
            Image img = ImageIO.read(new File("resources/sigils/targ.png"));
            Targaryen.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println("targ.jpg");
        }
        Targaryen.setPreferredSize(new Dimension(100, 120));
        Targaryen.setBorderPainted(false);
        Targaryen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                region = "resources/houseSelect/targregion.png";
                houseName = "Targ";
                houseDescription = ds.Targaryen();
                confirm();
            }
        });

//        try {
//            Image img = ImageIO.read(new File("resources/Crown.png"));
//            Crown.setIcon(new ImageIcon(img));
//        } catch (Exception e) {
//            System.out.println("crown.jpg");
//        }
//        Crown.setPreferredSize(new Dimension(100, 120));
//        Crown.setBorderPainted(false);
//        Crown.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                confirm();
//            }
//        });
//
//      add(Crown);
        
        add(RBaratheon);
        add(Greyjoy);
        add(Lannister);
        add(Stark);
        add(Targaryen);
        add(Tully);
        add(Tyrell);
        add(Martell);
        add(Arryn);
        add(Greyjoy);
    }

    public void confirmButton() {
        if(confirmButton == false) {
            JButton confirm = new JButton();
            JButton back = new JButton();
            try {
                Image img = ImageIO.read(new File("resources/houseSelect/begin.png"));
                confirm.setIcon(new ImageIcon(img));
                Image b = ImageIO.read(new File("resources/houseSelect/back.png"));
                back.setIcon(new ImageIcon(b));
            } catch (Exception e) {
                System.out.println("back.jpg");
            }
            confirm.setPreferredSize(new Dimension(100, 120));
            confirm.setBorderPainted(false);
            confirm.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    music.stop();
                    playSelectNoise psn = new playSelectNoise();
                    psn.playSelectNoise();
                    startGame();
                }
            });
            back.setPreferredSize(new Dimension(100, 120));
            back.setBorderPainted(false);
            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainMenu();
                }
            });
            setLayout(null);
            add(confirm);
            confirm.setBounds(1075,850,100,100);
            add(back);
            back.setBounds(25,850,100,100);
            AIButton();
        }
        confirmButton = true;
        revalidate();
    }

    public void AIButton(){
        //TODO: String[] numbers = {"1","2","3","4","5","6","7","8","9","10"}; Mulitplayer not funcitonal
        String[] numbers = {"1"};
        jb = new JComboBox<String>(numbers);
        add(jb);
        jb.setBounds(525,272,100,100);
    }

    public void confirm(){
        selected = true;
        confirmButton();
        repaint();
    }

    public void startGame() {
        game.startGame(houseName, (String) jb.getSelectedItem());
    }

    public void mainMenu(){
        game.loadIntro();
    }

    @Override
    protected void paintComponent(Graphics g) {
        {
            super.paintComponent(g);

            try {
                text = ImageIO.read(new File("resources/houseSelect/SelectHouse.png"));
                background = ImageIO.read(new File("resources/backgrounds/background3.png"));
                players = ImageIO.read(new File("resources/houseSelect/humanplayers.png"));
                house = ImageIO.read(new File(region));
                description = ImageIO.read(new File("resources/houseSelect/scroll.png"));
            } catch (Exception e) {
                System.out.print(house);
            }

            g.drawImage(background, 0, 0, null);
            g.drawImage(text, 400, 0, null);

            if (selected == true) {
                g.drawImage(house, 200, 600, null);
                g.drawImage(description, 600, 600, null);
                g.drawImage(players, 200, 300, null);
                g.drawString("House "+ houseName, 630, 630);
                drawString(g,houseDescription, 620, 650);
            }
        }
    }

    public void drawString(Graphics g, String text, int x, int y) {
        for (String line : text.split("\n"))
            g.drawString(line, x, y += g.getFontMetrics().getHeight());
    }
}
