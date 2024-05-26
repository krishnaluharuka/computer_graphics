import javax.swing.JFrame;
import java.awt.Graphics;

class scalingp extends JFrame
{
    int x1=50,y1=50,x2=150,y2=150;
    int sx=2,sy=4;
    int px1,px2,py1,py2;
    scalingp()
    {
        setTitle("Rotation about origin");
        setSize(500,500);
        px1=x1+sx;
        px2=x2*sx;
        py1=y1*sy;
        py2=y2*sy;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void paint(Graphics g)
    {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(px1, py1, px2, py2);
    }

    public static void main(String[] args) {
        new scalingp();
    }

}