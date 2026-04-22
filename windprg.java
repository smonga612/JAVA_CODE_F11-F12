import javax.swing.*;
import java.awt.event.*;
class myframe extends JFrame implements WindowListener,ActionListener
{
JFileChooser jfc;
myframe()
{
setVisible(true);
setSize(800,600);
setLayout(null);
jfc=new JFileChooser();
}
void designform()
{
JMenuBar jmb=new JMenuBar();
JMenu jFile= new JMenu("File");
JMenu jEdit= new JMenu("Edit");
JMenu jExit= new JMenu("Exit");


jmb.add(jFile);
jmb.add(jEdit);
jmb.add(jExit);

setJMenuBar(jmb);

JMenuItem jopen=new JMenuItem("Open");
JMenuItem jsave=new JMenuItem("Save");

jFile.add(jopen);
jFile.add(jsave);

jopen.addActionListener(this);
jsave.addActionListener(this);




//add(jmb);

addWindowListener(this);

}
public void actionPerformed(ActionEvent ae)
{
if (ae.getActionCommand()=="Open")
{int x=jfc.showOpenDialog(this);
JOptionPane.showMessageDialog(null,"you have selected file"+jfc.getSelectedFile());
}
else
JOptionPane.showMessageDialog(null,"you have clicked on save menu item");

}


public void windowDeactivated(WindowEvent we)
{
System.out.println("Windows deactivated");
}
public void windowActivated(WindowEvent we)
{
System.out.println("Windows activated");

}
public void windowIconified(WindowEvent we)
{
System.out.println("Windows iconified");

}
public void windowDeiconified(WindowEvent we)
{
System.out.println("Windows deiconified");

}
public void windowOpened(WindowEvent we)
{
System.out.println("Windows opened");

}
public void windowClosed(WindowEvent we)
{
System.out.println("Windows closed");


}
public void windowClosing(WindowEvent we)
{
System.out.println("Windows closing");
dispose();
}






}

class testprg
{
public static void main(String args[])
{
myframe mf=new myframe();
mf.designform();
}






}