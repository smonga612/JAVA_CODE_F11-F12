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
student s2=new student();
FileInputStream fis=new FileInputStream("stud.obj");
ObjectInputStream ois=new ObjectInputStream(fis);
s2=(student)ois.readObject();
s2.printRecord();

ois.close();
}


}
