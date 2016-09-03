import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Employee
{
private int id;
private String name,post;
private float salary;

public void getdata() throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("---enter employee data------");

System.out.println("id:");
id=Integer.parseInt(in.readLine());

System.out.println("name=");
name=in.readLine();

System.out.println("post=");
post=in.readLine();

System.out.println("salary=");
salary=Float.parseFloat(in.readLine());

System.out.println("--------------------------\n");
}
public void showData()
{
System.out.println("id="+id);

System.out.println("name="+name);
System.out.println("post="+post);

System.out.println("salary="+salary);

System.out.println("-------_______________----------\n");
}
} 
class EmployeeREcord
{
public static void main(String args[])

throws IOException{
BufferedReader in;
in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("how many employee=");

final int n;
n=Integer.parseInt(in.readLine());
Employee N[]=new Employee[n];
for(int i=00;i<n;i++)
{
N[i]=new Employee();
}
for(int i=0;i<n;i++)
{
System.out.println("entery no"+(i+1)+"/"+n);
N[i].getdata();
}
System.out.println("====output=====");
for(int i=0;i<n;i++)
{
N[i].showData();
}
}}
