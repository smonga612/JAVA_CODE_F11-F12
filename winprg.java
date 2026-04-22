import javax.swing.*;
import java.awt.event.*;

class sframe extends JFrame 
{
sframe()
{
setSize(800,800);
setVisible(true);
}
}

class myframe extends JFrame implements WindowListener
{
sframe s1;
JMenu jm1,jm2,jm3;
JMenuBar jmb;
myframe()
{
setSize(800,800);
setVisible(true);
addWindowListener(this);

}
public void  windowDeactivated(WindowEvent we)
{
System.out.println("Window deactivated");
}
public void  windowActivated(WindowEvent we)
{
System.out.println("Window activated");
}
public void  windowIconified(WindowEvent we)
{
System.out.println("Window iconified");

}

public void  windowDeiconified(WindowEvent we)
{
System.out.println("Window deiconified");

}
public void  windowOpened(WindowEvent we)
{
System.out.println("Window open");

}
public void  windowClosing(WindowEvent we)
{
System.out.println("Window closing");
dispose();
}
public void  windowClosed(WindowEvent we)
{
System.out.println("Window closed");
}
void designForm()
{
jmb=new JMenuBar();
setJMenuBar(jmb);
jm1=new JMenu("File");
jm2=new JMenu("Edit");
jm3=new JMenu("Exit");
jmb.add(jm1);
jmb.add(jm2);
jmb.add(jm3);


}



}

class testprg
{
public static void main(String args[])
{
myframe mf1=new myframe();
mf1.designForm();

}


}