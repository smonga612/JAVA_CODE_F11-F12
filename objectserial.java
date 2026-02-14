import java.io.*;
class student implements Serializable
{
 int Roll_No;
transient String name;
student()
{

}
student(int roll,String nam)
{
Roll_No=roll;
name=nam;
}

void printRecord()
{
System.out.println("Roll_No is "+Roll_No);
System.out.println("Name is "+name);
}
}

class testprg
{
public static void main(String args[]) throws Exception
{
student s1=new student(1001,"Vishal");
s1.printRecord();
FileOutputStream fos=new FileOutputStream("stud.obj");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(s1);
oos.close();



}







}