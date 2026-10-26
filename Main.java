import javax.swing.JFrame;

import java.awt.Dimension;

import javax.swing.JPanel;
public class Main {
    public static void main(String[] args) {
        JFrame gameWindow = new JFrame("Placeholder Window Title");

        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
       
        JPanel gamePanel = new JPanel();
        gamePanel.setPreferredSize(new Dimension(1000,1000));
        gameWindow.add(gamePanel);

        

        gameWindow.pack();
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setVisible(true);
        gameWindow.setResizable(false);
    }
}
