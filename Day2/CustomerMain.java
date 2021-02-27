import java.util.*;
class CustomerMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Employee e=new Employee();
System.out.println("Enter the details:");
String line;
String[] lineVector;
line=sc.nextLine();
lineVector=line.split(",");
e.setname(lineVector[0]);
e.setaddress(lineVector[1]);
e.setmobileno(lineVector[2]);
System.out.println("Name:"+e.getname());
System.out.println("Address:"+e.getaddress());
System.out.println("Mobile:"+e.getmobileno());
}
}