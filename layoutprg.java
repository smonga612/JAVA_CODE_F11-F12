import javax.swing.*;
import java.awt.*;
class myframe extends JFrame
{

myframe()
{
setVisible(true);
setSize(800,800);
/*
setLayout(new FlowLayout());

        add(new JButton("A"));
        add(new JButton("B"));
        add(new JButton("C"));
add(new JButton("A"));
        add(new JButton("B"));
        add(new JButton("C"));
add(new JButton("A"));
        add(new JButton("B"));
        add(new JButton("C"));
add(new JButton("A"));
        add(new JButton("B"));
        add(new JButton("C"));

*/

/*

setLayout(new BorderLayout());

add(new JButton("North"), BorderLayout.NORTH);
add(new JButton("South"), BorderLayout.SOUTH);
add(new JButton("East"), BorderLayout.EAST);
add(new JButton("West"), BorderLayout.WEST);
add(new JButton("Center"), BorderLayout.CENTER);
*/

setLayout(new GridLayout(3, 3));
add(new JButton("1"));
add(new JButton("2"));
add(new JButton("3"));
add(new JButton("4"));
add(new JButton("5"));
add(new JButton("6"));
add(new JButton("7"));
add(new JButton("8"));
add(new JButton("9"));



}



}

class testprg
{
public static void main(String args[])
{
myframe mf1=new myframe();
}
}




