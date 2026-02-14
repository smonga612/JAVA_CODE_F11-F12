class mythread implements Runnable
{
public void run()
{
Thread t=Thread.currentThread();
try
{
for (int i=1;i<=10;i++)
{
System.out.println("Value of i for thread "+t.getName()+" is "+i);
Thread.sleep(1000);
}
}
catch(InterruptedException ie)
{
}

}
}

class testprg
{
public static void main(String args[])
{
Thread t1=new Thread(new mythread());
Thread t2=new Thread(new mythread());
t1.setName("First");
t2.setName("Second");
t1.start();
t2.start();

}



}