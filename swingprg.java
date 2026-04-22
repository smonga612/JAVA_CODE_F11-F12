import javax.swing.*;

class myframe extends JFrame
{

myframe()
{
setVisible(true);
setSize(500,500);
setTitle("First swing frame");
setLayout(null);
}
void designform()
{
JButton jb=new JButton("Ok");
JPasswordField jpf=new JPasswordField(10);
JCheckBox jcb1=new JCheckBox("Windows");
JCheckBox jcb2=new JCheckBox("Linux");

jb.setBounds(50,100,60,30);
jpf.setBounds(50,200,60,30);
jcb1.setBounds(50,300,100,30);
jcb2.setBounds(200,300,100,30);

JRadioButton jrb1=new JRadioButton("C");
JRadioButton jrb2=new JRadioButton("C++");
JRadioButton jrb3=new JRadioButton("Java");

ButtonGroup bg=new ButtonGroup();


jrb1.setBounds(50,350,100,30);
jrb2.setBounds(200,350,100,30);
jrb3.setBounds(300,350,100,30);







add(jb);
add(jcb1);
add(jcb2);

bg.add(jrb1);
bg.add(jrb2);
bg.add(jrb3);


add(jrb1);
add(jrb2);
add(jrb3);



add(jpf);

}

}

class testprg
{
public static void main(String args[])
{
myframe mf1=new myframe();
mf1.designform();
}



}