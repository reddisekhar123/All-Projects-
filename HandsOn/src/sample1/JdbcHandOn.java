

package sample1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcHandOn {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String c=s.nextLine();
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practise","root","root");
switch(c)
{
case "I":
int in =s.nextInt();
String str=s.nextLine();
String strr=s.nextLine();
PreparedStatement ps=con.prepareStatement("insert into chemical values(?,?,?)");
ps.setInt(1, in);
ps.setString(2, str);
ps.setString(3, strr);
int i=ps.executeUpdate();
 if(i>0)
  {
  System.out.println("Successfully inserted");
  }
break;
case "R":
    Statement st=con.createStatement();
ResultSet rs=  st.executeQuery("select * from chemical");
while(rs.next())
{
System.out.println(rs.getInt(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
}
break;
case "U":
int in1 =s.nextInt();
String str1=s.nextLine();
String strr1=s.nextLine();
PreparedStatement p=con.prepareStatement("update chemical set AtomicWGHT=?,chemicalName=? where Symbol=?");
p.setInt(1, in1);
p.setString(2, str1);
p.setString(3, strr1);
p.executeUpdate();
break;
case "D":
String strr2=s.nextLine();
PreparedStatement ps1=con.prepareStatement("delete from chemical where Symbol=?");
 ps1.executeQuery();
 ps1.setString(3, strr2);
 System.out.println("Successfully ");
break;  
}
}
catch(Exception e)
{

}

}

}

