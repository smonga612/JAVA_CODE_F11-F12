import java.sql.*;
class Student
{
String driverName="oracle.jdbc.driver.OracleDriver";
Connection con;
Statement stmt;
void loadDriver() throws Exception
{
Class.forName(driverName);
System.out.println("Driver loaded successfully");

}

void establishConnection() throws Exception
{
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
System.out.println("Connection established successfully");
}

void insertRecord() throws Exception
{
stmt=con.createStatement();
String sql="insert into student values(1001,'Rakesh')";
stmt.executeUpdate(sql);
System.out.println("Record inserted successfully");
}

void selectAllRecord() throws Exception
{
stmt=con.createStatement();
String sql="select * from vitstudent";
ResultSet rs=stmt.executeQuery(sql);
while(rs.next())
{
System.out.println("Roll "+rs.getInt(1)+" Name :"+rs.getString(2)+" Mobile :"+rs.getInt(3));


}


System.out.println("Record inserted successfully");


}

}

class testprg
{
public static void main(String args[]) throws Exception
{
Student s1=new Student();
s1.loadDriver();
s1.establishConnection();
s1.insertRecord();
s1.selectAllRecord();
}




}



