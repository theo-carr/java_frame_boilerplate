package main;

import javax.swing.JFrame;

public class GameWindow {
    private JFrame jFrame;
    public GameWindow(GamePanel gamePanel) {
        //make jframe object
        jFrame = new JFrame();
        //setup window settings
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setVisible(true);


    }
}
