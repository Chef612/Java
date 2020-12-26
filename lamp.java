import java.util.*;
class lamp
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		int a[][]=new int[N][2];
		int i,j;
		for(i=0;i<N;i++)
		{
			a[i][0]=in.nextInt();
			a[i][1]=in.nextInt();
		}
		int s=0;
		for(i=0;i<N;i++)
		{
			s=s+(a[i][1]-a[i][0]);
			if(i!=N-1&&a[i+1][0]<a[i][1])
			{
				s=s-(a[i][1]-a[i+1][0]);
			}
		}
		System.out.print(s);
	}
}




