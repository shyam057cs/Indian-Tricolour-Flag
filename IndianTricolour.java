/*
 * IndianTricolour.java
 *
 * Author: Shyam Shankar <syamsankar91@gmail.com>
 * Licensed under GPL Version 3
 *
 * This class draws the Indian national Flag- Indian Tricolor
 * Usage : java IndianTricolour
 */


import javax.swing.*;
import java.awt.*;


public class IndianTricolour
{
  public static void main(String[] args) 
  {
     new IndianTricolour();
  }

  public IndianTricolour()
  {
    JFrame frame = new JFrame("Indian Tricolor");           // Setting the name of the frame(will be displayed in the top bar of window)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // So that the window closes on pressing the close button
    frame.getContentPane().add(new FlagComponent());        // At default the component will be place at the center of the frame.
    frame.setSize(900,630);                                 // Setting the size of the frame.
    frame.setVisible(true);  
  }

  public class FlagComponent extends JComponent
  {
      public void paint(Graphics g)
      {
          int height1 = 1300;                               
          int width1 = 1300;
          g.setColor(Color.black);  
          g.fillRect(0,0,height1,width1);                       // To give a black background around the flag when the window is maximised.
          
          height1 = 900;
          width1 = 200;
          Color saffron = new Color(255, 153, 51);              // Mixing the original saffron color.
          g.setColor(saffron);          
          g.fillRect(0,0,height1,width1);                       //  Setting the Saffron Rectangle
          g.setColor(Color.white);
          g.fillRect(0,200,height1,width1);                     // Setting the white middle rectangle
		  Image image = new ImageIcon("Chakra.jpg").getImage();
		  g.drawImage(image,380,210,180,180,this);   
		  /*
		  I had confusion about the green used in our flag, then I decided to go along with the official Indian flag seen in
		  http://india.gov.in/myindia/national_flag.php 
		  */       
          Color green = new Color(0,128,0);                     // Mixing the original green color of the Indian Flag.
          g.setColor(green);            
          g.fillRect(0,400,height1,width1);                     //  Setting the Green Rectangle
     }
  }
}
