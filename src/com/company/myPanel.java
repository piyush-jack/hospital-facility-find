package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myPanel extends JPanel implements ActionListener {
   final int PanelWidth=700;
   final int PanelHeight=438;
   Timer timer;
   Image enemy;
   Image backgroundImage;
   int xVelocity=1;
   int yVelocity=1;
   int x=0;
   int y=0;
   myPanel(){
        this.setPreferredSize(new Dimension(PanelWidth,PanelHeight));
        this.setBackground(Color.BLACK);
        enemy=new ImageIcon("sign.JPG").getImage();
        backgroundImage=new ImageIcon("10130.jpg").getImage();
        timer=new Timer(10,this);
        timer.start();
    }
    public void paint(Graphics g){
       super.paint(g);
       Graphics2D g2D=(Graphics2D) g;
        g2D.drawImage(backgroundImage,0,0,null);
       g2D.drawImage(enemy,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(x>=PanelWidth-enemy.getWidth(null)||x<0){
           xVelocity=xVelocity*-1;
       }
              x=x+xVelocity;
              repaint();
    }
}
