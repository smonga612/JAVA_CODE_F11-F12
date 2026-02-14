class testprg
{
public static void main(String args[])
{
Thread t1=new Thread(
()->
{
for(int i=1;i<=10;i++)
{
System.out.println("Value of i is "+i);
}
}
);


Thread t2=new Thread(()->
{
for(int j=10;j<=20;j++)
{
System.out.println("Value of j is "+j);
}
}
);

t1.start();
t2.start();




}
}