package UI;

import coreElements.map;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by marcrossi on 8/1/17.
 */
public class Window extends JFrame implements KeyListener{
    map westros = new map();
    uiMap fr = new uiMap(westros);
    UI.splitPane splitPane = new splitPane(fr);

    public int acceleration = 3;

    public Window(){
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1200,1000);
        getContentPane().setLayout(new GridLayout());
        setResizable(false);
        addKeyListener(this);
        getContentPane().add(splitPane);
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            if(westros.getY() <= 0) {
                acceleration('y', '+');
                fr.repaint();
            }
        }

        if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            if(westros.getY() >= -1365) {
                acceleration('y', '-');
                fr.repaint();
            }
        }

    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {;
            acceleration = 3;
        }
        if(key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {;
            acceleration = 3;
        }
    }

    public void acceleration(char XorY, char MinusorPlus) {
        if (XorY == 'y' && MinusorPlus == '+') {
            westros.setY(westros.getY() + accelerationValue());
        }

        if (XorY == 'y' && MinusorPlus == '-') {
            westros.setY(westros.getY() - accelerationValue());
        }
    }

    public int accelerationValue() {
        acceleration = (int) (acceleration * 1.5);
        return acceleration;
    }
}
