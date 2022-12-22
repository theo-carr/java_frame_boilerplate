package main;

import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
    public GamePanel() {
        //game panel is the actual picture that gets put on the jframe
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(100,100, 200, 50);
    }
    
}
