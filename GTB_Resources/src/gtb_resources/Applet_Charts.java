/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtb_resources;

import java.applet.*;
import java.awt.*;
public class Applet_Charts extends Applet
{
    TextField t[];
    @Override
    public void init()
    {
        this.setSize(1000, 600);
        t=new TextField[6];
        for(int x=0;x<t.length;x++)
        {
            t[x]=new TextField(10);           
            add(t[x]);
        }
        
    }
    @Override
    public void paint(Graphics g)
    {        
        for(int a=0,b=60;a<3;a++,b+=40)
        {
            g.drawString(t[a].getText(), 50, b);
        }
        for(int a=3,b=50;a<t.length;a++,b+=40)
        {           
           g.fillRect(130, b, Integer.parseInt(t[a].getText()), 20);
        }
    }
    @Override
    public boolean action(Event e,Object o)
    {
        repaint();
        return true;
    }
    
}