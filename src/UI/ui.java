package UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by marcrossi on 8/14/17.
 */
public class ui extends JPanel {
    public ui(){
        setVisible(true);
        setSize(100, 250);
        setLocation(0,50);
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
    }
}
