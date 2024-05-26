import java.awt.Graphics;
import javax.swing.JFrame;

class scaling extends JFrame{
    int x1=50,y1=50,x2=100,y2=100;
    int sx=2;
    int sy=4;
    int px1,px2,py1,py2;
    public scaling(){
        setTitle("Line Scaling");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        px1=x1*sx;
        px2=x2*sx;
        py1=y1*sy;
        py2=y2*sy;
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(px1, py1, px2, py2);
    }
    public static void main(String[] args) {
        new scaling();
    }
}