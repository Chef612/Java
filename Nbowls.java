import java.util.*;
class Nbowls
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int i,flag=0;
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=n-1;i>0;i--)
		{
			if(a[i]<9)
			{
				System.out.print(i+1);
				flag=0;
				break;
			}
			if(a[i]==9&&a[i-1]<9)
			{
				System.out.println(i);
				flag=0;
				break;
			}
			else if(a[i]==9)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.print(0);
		}
	}
}

