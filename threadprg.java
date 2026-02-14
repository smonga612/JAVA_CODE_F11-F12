class mythread extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("Value of i is "+i);
}
}
}

class mythread1 extends Thread
{
public void run()
{
for(int j=10;j>0;j--)
{
System.out.println("Value of j is "+j);
}
}
}



class testprg
{
public static void main(String args[])
{
mythread m1=new mythread();
mythread1 m2=new mythread1();

m1.start();
m2.start();


}




}