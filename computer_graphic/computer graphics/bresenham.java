import java.io.*;
import java.applet.*;
import java.util.*;
import java.awt.*;

public class bresenham extends Applet{
    public void paint (Graphics g){
    int x,y,k;
    double dx,dy,p;
    int x1=10,y1=100,x2=500,y2=500;
    dx=Math.abs(x2-x1);
    dy=Math.abs(y2-y1);
    x=x1;
    y=y1;
    p=2*dy-dx;
    g.fillOval((int)x,(int)y,5,5);
    for(k=0;k<dx;k++)
    {
        if(p<0)
        {
            g.fillOval(x++,y,5,5);
            p=p+(2*dy);
        }
        else
        {
            g.fillOval(x++,y++,5,5);
            p=p+2*(dy-dx);
        }
    }
}}
/*<applet code="bresenham.class" width="700" height="700"></applet>*/