package co.edu.utp.misiontic2022.c2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PrimeraGui {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi primera GUI");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);

        JButton button1 = new JButton("Presionar!");
        frame.getContentPane().add(button1);


        frame.setVisible(true);
    }
    
}
