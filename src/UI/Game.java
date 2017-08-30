package UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by marcrossi on 8/1/17.
 */
public class Game extends JFrame {
    uiMap fr;
    splitPane splitPane;
    mainMenu mm;
    houseSelect HS;

    public Game(){
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1200,1000);
        getContentPane().setLayout(new GridLayout());
        setResizable(false);

        loadIntro();
    }

    public void loadIntro(){
        getContentPane().removeAll();
        mm = new mainMenu(this);
        getContentPane().add(mm);
        add(mm);
        revalidate();
        repaint();
    }

    public void loadHouseSelect(Thread t) {
        remove(mm);
        HS = new houseSelect(this, t);
        getContentPane().add(HS);
        revalidate();
        repaint();
    }

    public void startGame(String house, String players){
        remove(HS);
        splitPane = new splitPane(house);
        getContentPane().add(splitPane);
        revalidate();
        repaint();
    }


}
