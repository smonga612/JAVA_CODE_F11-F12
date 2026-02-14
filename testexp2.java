class myexception extends Exception
{
myexception()
{
System.out.println("user defined exception");
}

}


class testprg
{
public static void main(String args[]) throws myexception
{

throw new myexception();
System.out.println("last message");


}
}