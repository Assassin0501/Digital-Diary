package com.todoapp;

import javax.swing.*;
import java.awt.*;

public class JavaFrame extends JFrame {
    JFrame frame;   //variable declaration

    String path = "Images/icon.png";

    ImageIcon logo = new ImageIcon(path);
    JPanel title_panel;
    JLabel title_label;

    JavaFrame()  //constructor of class Java Frame
    {
        this.setSize(920, 850);    //set size of Java Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Default close Operation (x) button
        this.setTitle("Diary Intelligence"); //set title to JFrame
        this.getContentPane().setBackground(new Color(210, 218, 255)); //Set background color
        this.setIconImage(logo.getImage());  //set Icon as Image in Images (.getImage() to load image)
        this.setLayout(null); //

        title_panel = new JPanel(); //create instance of JPanel
        title_panel.setBounds(0, 0, 920, 100);
        title_panel.setBackground(new Color(171, 178, 255));  //set background color of title_panel

        title_label = new JLabel();  //create instance of JLabel
        title_label.setText("Get More Done with Digital Intelligence !"); //set text to JLabel
        title_label.setFont(new Font("Monospaced", Font.BOLD, 25)); //Shortlisted:Monospaced
//        title_label.setVerticalAlignment();

        title_label.setBounds(0, 0, 920, 100);
        title_panel.add(title_label); //adding title_label to title_panel

        this.add(title_panel); //adding title_panel to JFrame
        this.setResizable(false);   //don't allow to expand screen
        this.setVisible(true); //actually display JFrame on device

    }
}
