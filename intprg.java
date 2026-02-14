interface shape
{
public void area(float ...a);
public void print();

}



class circle implements shape
{
float area;
public void area(float ...a)
{
area=(float)3.14*a[0]*a[0];
}
public void print()
{
System.out.println("Area is "+area);
}
}

class rectangle implements shape
{
float area;
public void area(float ...a)
{
area=a[0]*a[1];
}
public void print()
{
System.out.println("Area is "+area);
}
}

class testprg
{
public static void main(String args[])
{
circle c1=new circle();
c1.area((float)2.0);
c1.print();
rectangle r1=new rectangle();
r1.area(2,3);
r1.print();




}




}
