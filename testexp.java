class testprg
{
public static void main(String args[])
{
int x,y;
try
{
x=Integer.parseInt(args[0]);
y=Integer.parseInt(args[1]);
System.out.println("Addition is "+(x+y));
System.out.println("division is "+(x/y));
System.out.println("sub is "+(x-y));
System.out.println("multiplication is "+(x*y));
}
catch(ArithmeticException ae)
{
System.out.println("Exception generated");
}
finally
{
System.out.println("execute before closing");

}



}
}