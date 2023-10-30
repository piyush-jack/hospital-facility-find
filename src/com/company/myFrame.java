package com.company;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
           myPanel panel;


           myFrame(){

               panel=new myPanel();
               this.setDefaultCloseOperation(EXIT_ON_CLOSE);
               this.setResizable(false);
               this.add(panel, BorderLayout.NORTH);
                this.setTitle("MAIN WINDOW");

               this.setSize(700,510);
               this.setVisible(true);
               this.setLocationRelativeTo(null);

           }

}
