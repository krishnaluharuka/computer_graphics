import java.awt.Graphics;
import javax.swing.JFrame;

public class shear_x1 extends JFrame{
    int x1=100,y1=50,x2=200,y2=50,x3=200,y3=200,x4=100,y4=200;
    int shx=2;
    int px1,px2,px3,px4;
    public shear_x1(){
      setTitle("X-direction shear of a rectangle");
      setSize(800,800);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      px1=x1+y1*shx;
      px2=x2+y2*shx;
      px3=x3+y3*shx;
      px4=x4+y4*shx;
      setVisible(true);
    }

    public void paint(Graphics g)
    {
      g.drawLine(x1,y1,x2,y2);
      g.drawLine(x2,y2,x3,y3);
      g.drawLine(x3,y3,x4,y4);
      g.drawLine(x4,y4,x1,y1);

      g.drawLine(px1,y1,px2,y2);
      g.drawLine(px2,y2,px3,y3);
      g.drawLine(px3,y3,px4,y4);
      g.drawLine(px4,y4,px1,y1);

    }

    public static void main(String[] args) {
        new shear_x1();
    }
}