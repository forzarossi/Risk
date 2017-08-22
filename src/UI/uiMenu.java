package UI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by marcrossi on 8/14/17.
 */
public class uiMenu extends JPanel {

    public uiMenu(){
        setVisible(true);
        setBackground(Color.red);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
    }
}
