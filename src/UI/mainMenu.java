package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by marcrossi on 8/22/17.
 */
public class mainMenu extends JPanel{
    public Game game;

    public mainMenu(Game gm) {
        game = gm;
        JButton start = new JButton("Start");
        add(start);

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });
    }

    public void startGame(){
        game.startGame();
    }


}
