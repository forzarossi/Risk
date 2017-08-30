package music;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class sounds implements Runnable{

    private Player player;

    public void playTheme() {
        try {
            BufferedInputStream buffer = new BufferedInputStream(
                    new FileInputStream("resources/sounds/theme.mp3"));
            player = new Player(buffer);
            player.play();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        playTheme();
    }
}
