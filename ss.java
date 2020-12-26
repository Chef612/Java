import java.util.*;
class ss
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a[]={1,2,3,3,7,5,1,3,1,5};
		int c[]=new int[100];
		int i,j,d=1;
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(a[i]==a[j])
				{
					c[i]=a[i];
				}
			}
			if(c[i]!=0)
			{
			System.out.println(c[i]);
		}
		}
	}
}
