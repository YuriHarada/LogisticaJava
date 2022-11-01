package graphics;

import java.awt.BorderLayout;

import java.awt.*;
import javax.swing.*;  

public class graphics {
    
    public void Start(){
        JFrame frame =new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        
        frame.setMinimumSize(new Dimension(800, 800));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Teste");
        frame.pack();
        frame.setVisible(true);
    }
}
