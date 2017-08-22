package UI;



import javax.swing.*;
import java.awt.*;


/**
 * Created by marcrossi on 8/14/17.
 */

public class splitPane extends JSplitPane {
    uiMap UIMAP;
    uiMenu UIMENU = new uiMenu();

    public splitPane(uiMap frame){
        UIMAP = frame;

        setVisible(true);
        setOrientation(JSplitPane.VERTICAL_SPLIT);
        setDividerLocation(750);

        setEnabled(false);

        setTopComponent(UIMAP);
        setBottomComponent(UIMENU);
    }

}
