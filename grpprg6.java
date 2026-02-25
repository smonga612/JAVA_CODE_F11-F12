import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;
class myframe extends Frame implements MouseListener,MouseMotionListener
{
myframe()
{
setVisible(true);
setSize(800,600);
setLayout(null);
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseExited(MouseEvent me)
{
setBackground(Color.BLUE);

System.out.println("Mouse exit");
}
public void mouseEntered(MouseEvent me)
{
setBackground(Color.RED);
System.out.println("Mouse enter");
}

public void mouseClicked(MouseEvent me)
{
setBackground(Color.YELLOW);

System.out.println("Mouse click");
}

public void mousePressed(MouseEvent me)
{
System.out.println("Mouse pressed");
}

public void mouseReleased(MouseEvent me)
{
System.out.println("Mouse released");
}


public void mouseMoved(MouseEvent me)
{
System.out.println("X= "+me.getX()+" Y: "+me.getY());
if (me.getX() > 500)
setBackground(Color.WHITE);
else
setBackground(Color.BLACK);

System.out.println("Mouse move");
}

public void mouseDragged(MouseEvent me)
{
System.out.println("Mouse dragged");
}




}

class testprg
{
public static void main(String args[])
{
myframe mf1=new myframe();


}
}


