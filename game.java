import java.util.*;
class game
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t!=0)
		{
			int l=in.nextInt();
			int a[]=new int[l];
			int i,flag=0;
			for(i=0;i<l;i++)
			{
				a[i]=in.nextInt();
			}
			for(i=0;i<l-1;i++)
			{
				if((a[i]==0 && a[i+1]==1)||(a[i]==1 && a[i+1]==0))
				{
					flag++;
				}
				else
				{
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("No winner");
			}
			if(flag%2==0)
			{
				System.out.println("Joe");
			}
			else if(flag%2!=0)
			{
				System.out.println("John");
			}
		}
	}
}
