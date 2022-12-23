package main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class GamePanel extends JPanel{

    private MouseInputs mouseInputs; // so we can use two different objects from mouse inputs

    public GamePanel() {
        //game panel is the actual picture that gets put on the jframe

        //add keylistener
        addKeyListener(new KeyboardInputs());
        //add mouse listeners
        mouseInputs = new MouseInputs(); //need to initialize our classes mouse listener
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.fillRect(100,100, 200, 50);
    }
    
}
