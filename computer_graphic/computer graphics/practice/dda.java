import java.awt.Graphics;
import java.applet.Applet;

public class dda extends Applet{
    public void paint(Graphics g)
    {
       double x1=200,y1=500,x2=600,y2=200;
       double dx,dy,xc,yc,steps,x,y,j;
       dx=x2-x1;
       dy=y2-y1;
       if(Math.abs(dx)>Math.abs(dy))
       {
        steps=Math.abs(dx);
       }
       else
       {
        steps=Math.abs(dy);
       }
       yc=dy/steps;
       xc=dx/steps;
       x=x1;
       y=y1;
       g.fillOval((int)x,(int)y,2,2);
       for(j=1;j<=steps;j++)
       {
        x=x+xc;
        y=y+yc;
        g.fillOval((int)x,(int)y,2,2);
       }
    }    
}

/*<applet code="dda.class" width=800 height=800></applet> */