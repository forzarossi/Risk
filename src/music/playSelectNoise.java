package music;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class playSelectNoise{

    private Player player;

    public void playSelectNoise() {
        try {
            BufferedInputStream buffer = new BufferedInputStream(
                    new FileInputStream("resources/sounds/select.mp3"));
            player = new Player(buffer);
            player.play();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}