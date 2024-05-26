import java.awt.Graphics;
import javax.swing.JFrame;

class shearigxp extends JFrame{
     int x1=50,x2=50,x3=200,x4=200,y1=50,y2=100,y3=100,y4=50;
     int shx=2;
     int px1,px2,px3,px4;
     shearigxp()
     {
        setTitle("shearing x");
        setSize(700,700);
        px1=x1+y1*shx;
        px2=x2+y2*shx;
        px3=x3+y3*shx;
        px4=x4+y4*shx;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
     }

     public void paint(Graphics g)
     {

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x4, y4);
        g.drawLine(x4, y4, x1, y1);

        g.drawLine(px1, y1, px2, y2);
        g.drawLine(px2, y2, px3, y3);
        g.drawLine(px3, y3, px4, y4);
        g.drawLine(px4, y4, px1, y1);
     }

     public static void main(String[] args) {
        new shearigxp();
     }
}