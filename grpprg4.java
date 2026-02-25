import java.awt.*;
import java.awt.event.*;
class myframe extends Frame 
{
Label l1,l2,l3;
TextField tf1,tf2;
Button b1,b2;

myframe()
{
setSize(800,600);
setVisible(true);
setLayout(null);
designForm();
}

void designForm()
{
l1=new Label("Enter the number-1");
l2=new Label("Enter the number-2");
l3=new Label("Result is : ");
tf1=new TextField(20);
tf2=new TextField(20);
b1=new Button("Add");
b2=new Button("Subtract");


l1.setBounds(300,200,150,30);
l2.setBounds(300,250,150,30);

tf1.setBounds(475,200,100,30);
tf2.setBounds(475,250,100,30);
b1.setBounds(350,350,150,30);
l3.setBounds(300,400,150,30);
b2.setBounds(450,350,150,30);


b1.addActionListener(e->
{
int a,b,c;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
c=a+b;
l3.setText("Result is "+c);
}

);

b2.addActionListener(e->
{
int a,b,c;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
c=a-b;
l3.setText("Result is "+c);
}

);

add(l1);
add(l2);
add(tf1);
add(tf2);
add(b1);
add(l3);
add(b2);
}


}

class testprg
{
public static void main(String args[])
{
myframe mf1=new myframe();
}



}