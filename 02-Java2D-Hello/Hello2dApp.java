import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("EU ESTOU COM MUITA FOME !!!!!");
        this.setSize(500, 500);
        this.setVisible(true);
        this.repaint();
    }
    @Override
    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.black);
        int w = getWidth();
        int h = getHeight();
        g2d.fillRect(0,0, w,h);
        g2d.setPaint(new Color(255,67,33));
        g2d.fillOval(w/2-150,h/2-20,300,40);
        g2d.setPaint(Color.green);
        g2d.fillOval(w/2-150,h/2-50,300,40);
        Color Bege = new Color(210,180,140);
        g2d.setPaint(Bege);
        g2d.fillOval(w/2-150,h/2-80,300,40);
        g2d.fillOval(w/2-150,h/2+10,300,40);
        g2d.setPaint(Color.yellow);
        g2d.fillOval(w/2-450,h/2-160,300,300);
        int[] x ={w/2,w/2,w/2};
        int[] y ={h/2,h/2,h/2};
        g2d.setPaint(Color.white);
        g2d.fillPolygon(x,y,3);

    }
}
