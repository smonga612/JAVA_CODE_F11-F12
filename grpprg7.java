import java.awt.*;
import java.awt.Graphics.*;

class myframe extends Frame
{
myframe()
{
setVisible(true);
setSize(800,800);
}
public void paint(Graphics g)
{
Font f=new Font("ARIAL",Font.BOLD,120);
g.setFont(f);
//g.setColor(Color.RED);
//g.drawRect(100,100,500,100);
//g.fillRect(100,100,500,100);

//g.drawOval(200,200,400,400);
g.setColor(Color.BLUE);

//g.fillOval(200,200,400,400);
//g.drawLine(100,100,800,600);
int i=100;
while(i<700)
{
g.setColor(Color.BLUE);

g.drawString("Hello",i,400);

try
{
Thread.sleep(100);
g.setColor(Color.WHITE);
g.drawString("Hello",i,400);
i=i+10;
}catch(Exception e)
{
}
}
}


}

class testprg
{
public static void main(String args[])
{
myframe mf1=new myframe();


}
}