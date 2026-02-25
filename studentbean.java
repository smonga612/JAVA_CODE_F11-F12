import java.io.*;
class studentbean implements Serializable
{
private String[] subject;
public studentbean()
{

}

public void setSubject(String[] subject)
{
this.subject=subject;
}

public String[] getSubject()
{
return(subject);
}


public void setSubject(int index,String data)
{
subject[index]=data;
}

public String getSubject(int index)
{
return(subject[index]);
}
public String toString()
{
String d="test";
System.out.println(subject);
//for (String s: subject)
//d=d+s+", ";
//d=d+"]";
return(d);


}

}

class testprg
{
public static void main(String args[])
{
studentbean s1=new studentbean();
String s[]={"C++","JAVA","OS"};
s1.setSubject(s);

String slist[]=s1.getSubject();
for (String v:slist)
{
System.out.println(v);
}

s1.setSubject(1,"Networking");

slist=s1.getSubject();
for (String v:slist)
{
System.out.println(v);
}


}
}