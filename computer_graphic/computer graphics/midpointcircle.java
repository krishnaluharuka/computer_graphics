import java.awt.*;
import java.applet.*;

public class midpointcircle extends Applet{
    public void paint(Graphics g)
    {
        int xc=200;
        int yc=200;
        int rad=100;
        int x=0;
        int y=rad;
        int p=5/4-rad;
        while(x<y){
            if(p<0){
                x++;
                p=p+2*x+2+1;
            }
            else
            {
                x++;
                y--;
                p=p+2*x+2+1-2*y+2;
            }
            g.fillOval(xc+x,yc+y,2,2);
            g.fillOval(xc+y,yc-x,2,2);
            g.fillOval(xc-y,yc+x,2,2);
            g.fillOval(xc-x,yc+y,2,2);
            g.fillOval(xc+x,yc-y,2,2);
            g.fillOval(xc+y,yc+x,2,2);
            g.fillOval(xc-y,yc-x,2,2);
            g.fillOval(xc-x,yc-y,2,2);
            
        }
    }
}

/*<applet code="midpointcircle.class" width="400" height="400"></applet> */