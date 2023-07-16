/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Mellow
 */
public class Ex1Frame extends JFrame {

    public Ex1Frame() throws HeadlessException {
        setTitle("Germina Masetla");
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setSize(800, 500);
        setBackground(Color.yellow);
        setForeground(Color.red);
    }
    
    
}
