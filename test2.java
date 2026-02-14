class A
{
int a;
void setA(int a)
{
this.a=a;
}
int getA()
{
return(a);
}
}

class testprg
{
public static void main(String args[])
{
A a1=new A();
a1.setA(20);
System.out.println(a1.getA());

}

}
