import javax.swing.*;
import java.awt.*;

/**
 * Created by marcrossi on 8/14/17.
 */

public class game extends JPanel {
    uiMap fr;
    ui ui = new ui();

    public game(uiMap frame){
        fr = frame;

        setSize(1200,1000);
        setVisible(true);

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(fr);
        ui.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        add(ui);
    }

}
