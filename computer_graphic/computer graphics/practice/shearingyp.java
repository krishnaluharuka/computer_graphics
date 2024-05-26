import java.awt.Graphics;
import javax.swing.JFrame;

class shearingyp extends JFrame{
     int x1=50,x2=50,x3=200,x4=200,y1=50,y2=100,y3=100,y4=50;
     int shy=2;
     int py1,py2,py3,py4;
     shearingyp()
     {
        setTitle("shearing y");
        setSize(700,700);
        py1=y1+x1*shy;
        py2=y2+x2*shy;
        py3=y3+x3*shy;
        py4=y4+x4*shy;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
     }

     public void paint(Graphics g)
     {

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x4, y4);
        g.drawLine(x4, y4, x1, y1);

        g.drawLine(x1, py1, x2, py2);
        g.drawLine(x2, py2, x3, py3);
        g.drawLine(x3, py3, x4, py4);
        g.drawLine(x4, py4, x1, py1);
     }

     public static void main(String[] args) {
        new shearingyp();
     }
}