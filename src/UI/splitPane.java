package UI;



import coreElements.Player;
import gameplay.createHouses;

import javax.swing.*;
import java.awt.*;


/**
 * Created by marcrossi on 8/14/17.
 */

public class splitPane extends JSplitPane {
    uiMap UIMAP;
    uiMenu UIMENU;
    createHouses ch;
    Player user;

    public splitPane(String h){
        ch = new createHouses();

        if(h == "Stark"){
            user = new Player("Stark", ch.createStark(), 1,13, 1000);
        }
        else if(h == "Lannister"){
            user = new Player("Lannister", ch.createLannister(), 1,5 ,1000);
        }
        else if(h == "Greyjoy"){
           user = new Player("Greyjoy", ch.createGreyjoy(), 1,5,1000);
        }
        else if(h == "Arryn") {
            user = new Player("Arryn", ch.createArryn(), 1, 5,1000);
        }
        else if(h == "Baratheon"){
            user = new Player("Baratheon", ch.createBaratheon(), 1,5,1000);
        }
        else if(h == "Martell"){
            user = new Player("Martell", ch.createMartell(), 1,5,1000);
        }
        else if(h == "Targ") {
            user = new Player("Targ", ch.createTrag(), 1, 5, 1000);
        }
        else if(h == "Tully"){
            user = new Player("Tully", ch.createTully(), 1,5,1000);
        }
        else if(h == "Tyrell") {
            user = new Player("Tyrell", ch.createTyrell(), 1,5, 1000);
        }

        UIMENU = new uiMenu(user);
        UIMAP = new uiMap(user);

        setOrientation(JSplitPane.VERTICAL_SPLIT);
        setDividerLocation(750);
        setEnabled(false);

        setBottomComponent(UIMENU);
        setTopComponent(UIMAP);

        repaint();
    }

}
