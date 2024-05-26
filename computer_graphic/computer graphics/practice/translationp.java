import java.awt.Graphics;
import javax.swing.JFrame;

class translationp extends JFrame
{
    int x1=50,y1=50,x2=150,y2=150;
    int tx=200,ty=200;
    int px1,px2,py1,py2;
    translationp()
    {
         setTitle("Line Translation");
         setSize(500,500);
         px1=x1+tx;
         px2=x2+tx;
         py1=y1+ty;
         py2=y2+ty;
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(null);
         setVisible(true);
    }

    public void paint(Graphics g)
    {
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(px1,py1,px2,py2);
    }
    public static void main(String[] args) {
        new translationp();
    }
}
