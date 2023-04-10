// Demonstrate PaintMode

import java.awt.*;
import javax.swing.*;

public class PaintMode {

    public static void main(String[] args) {
        
        PaintMode o = new PaintMode();
        PaintModeFrame f = o.new PaintModeFrame() ;
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class PaintModeFrame extends JFrame {
        
        public PaintModeFrame () {
            
            setTitle("Paint Mode Title");
            setSize(500,500);
            setVisible(true);
            
            PaintModePanel p = new PaintModePanel();
            
            Container c = getContentPane();
            c.add(p);
        }
    }

    class PaintModePanel extends JPanel {
        
        int chsX=100, chsY=100;
        
        @Override
        
        public void paintComponent (Graphics g) {
            g.drawLine(0,0,100,100);
            g.drawLine(0,100,100,0);
            g.setColor(Color.blue);
            g.drawLine(40,25,250,180);
            g.drawLine(75,90,400,400);
            g.setColor(Color.green);
            g.drawLine(10,10,60,50);
            g.drawLine(100,10,60,50);
            g.setColor(Color.red);
            g.drawRoundRect(190, 10,60,50,15,15);
            g.fillRoundRect(70,90,140,100,30,40);
            g.setColor(Color.cyan);
            g.drawLine(20,150,400,40);
            g.drawLine(5,290,80,19);
            g.setXORMode(Color.black);
            g.drawLine(chsX-10, chsY, chsY+10, chsY);
            g.drawLine(chsX, chsY-10, chsX, chsY+10);
        }
    }
}
