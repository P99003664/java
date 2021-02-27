import java.util.*;
class CompanyMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Company c=new Company();
System.out.println("Enter the company name:");
String s1=sc.nextLine();
System.out.println("Enter the employees:");
String s3;
s3=sc.nextLine();
System.out.println("Enter TeamLead:");
String s2=sc.nextLine();
c.setcomname(s1);
c.setempname(s3);
c.setteamlead(s2);
System.out.println("Name:"+c.getname());
System.out.println("Address:"+c.getempname());
System.out.println("Mobile:"+c.getteamlead());
}
}
