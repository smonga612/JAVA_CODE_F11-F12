import java.applet.*;
import java.awt.Graphics;
import java.awt.*;
public class testapplet extends Applet
{
public void init()
{
System.out.println("Inside init");
}


public void start()
{
System.out.println("Inside start");
}

public void stop()
{
System.out.println("Inside stop");
}
public void destroy()
{
System.out.println("Inside destroy");
}

public void paint(Graphics g)
{
System.out.println("Inside paint");
g.drawString("Welcome to java applet",100,100);

}




}