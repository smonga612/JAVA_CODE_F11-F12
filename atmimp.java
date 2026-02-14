class bankaccount implements Runnable
{
int balance=1000;
public void run()
{
String name=Thread.currentThread().getName();
withdraw(name);
}

synchronized void withdraw(String name)
{
System.out.println("login by "+name);
if(balance==1000)
{
System.out.println("Transaction done "+name);
balance=balance-1000;
System.out.println("New balance is Rs "+balance);
}
else
{
System.out.println("Insufficent Balance for "+name);

}
}

}

class testprg
{
public static void main(String args[])
{
bankaccount b1=new bankaccount();
Thread atm1=new Thread(b1);
Thread atm2=new Thread(b1);
atm1.setName("Rajesh");
atm2.setName("Vishal");
atm1.start();
atm2.start();



}





}
