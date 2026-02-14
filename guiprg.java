import java.awt.*;
class myframe extends Frame
{
myframe(int x,int y,String title)
{
setVisible(true);
setSize(x,y);
setTitle(title);
while(true)
{
try
{
setBackground(Color.RED);
Thread.sleep(1000);
setBackground(Color.BLUE);
Thread.sleep(1000);
}

catch(Exception e)
{
}
}

}
}

class testprg
{
public static void main(String args[])
{
//myframe m1=new myframe(100,400,"M1 Frame");
myframe m2=new myframe(800,700,"M2 Frame");
//myframe m3=new myframe(700,200,"M3 Frame");
//myframe m4=new myframe(600,400,"M4 Frame");



}
}

