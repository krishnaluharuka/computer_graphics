import javax.swing.JFrame;
import java.awt.Graphics;

class rotationp extends JFrame
{
    int x1=50,y1=50,x2=150,y2=150;
    int angle=30;
    double t=angle*Math.PI/180;
    int px1,px2,py1,py2;
    rotationp()
    {
        setTitle("Rotation about origin");
        setSize(500,500);
        px1=(int)(x1*Math.cos(t)-y1*Math.sin(t));
        px2=(int)(x2*Math.cos(t)-y2*Math.sin(t));
        py1=(int)(y1*Math.cos(t)+x1*Math.sin(t));
        py2=(int)(y2*Math.cos(t)+x2*Math.sin(t));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void paint(Graphics g)
    {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(px1, py1, px2, py2);
    }

    public static void main(String[] args) {
        new rotationp();
    }

}