import java.util.*;
import java.lang.Math.*;
class intern
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter ID");
		int ID=in.nextInt();
		int i;
		int NID=ID%10;

		i=(ID-((NID-1)*5000))/5000;

		if(i==1)
		{
			System.out.print("First Intern ");
		}
		if(i==2)
				{
					System.out.print("Second Intern ");
		}
		if(i==3)
				{
					System.out.print("Third Intern ");
		}
		if(i==4)
				{
					System.out.print("Fourth Intern ");
		}
		//System.out.println(i);
		if(NID==0)
		{
			System.out.print("[Day 1]");
		}
		else if(NID==1)
				{
					System.out.print("[Day 2]");
		}
		else if(NID>1)
		{
			System.out.print("[Day "+NID+"]");
		}

	}
}
