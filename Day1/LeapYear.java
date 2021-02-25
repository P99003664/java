import java.util.*;
public class LeapYear
{
        static int checkLeapYear(int n)
	{
            if(n>0)
            {
		if((n%4==0 && n%100!=0) || n%400==0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
            }
	    else
            {
               return -1;
            }

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=checkLeapYear(n);
		if(x==1)
			System.out.println("yes");
		else if(x==0)
			System.out.println("No");
		else
			System.out.println("Invalid input");
	}
}