class testprg
{
public static void main(String args[])
{
int a=0,b=0;
try
{
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
System.out.println("Addition is "+(a+b));
System.out.println("Division is "+(a/b));
}
catch(ArithmeticException ae)
{
int x,y;

System.out.println("Denominator value is zero");
}
catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println("Input value is missing....");
}

System.out.println("subtraction is "+(a-b));
System.out.println("Multiplication is "+(a*b));
//System.out.println("Value of x " +x);






}




}