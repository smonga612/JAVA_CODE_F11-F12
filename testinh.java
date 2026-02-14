class A
{
void display()
{
System.out.println("Inside the class A");
}
}

class B extends A
{
void display()
{
System.out.println("Inside the class B");
}
void print()
{
System.out.println("Inside class B print");

}

}

class testprg
{
public static void main(String args[])
{
A a1=new A();
A b1=new B();
a1.display();
b1.display();
b1.print();
}
}