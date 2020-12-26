import java.util.*;
class encode
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		String s=in.nextLine();
		int l=s.length();
		char a[]=new char[l];
		int b[]=new int[l];
		char a1[]=new char[l];
		int c[]=new int[l];
		int k=0,i;
		for(i=0;i<l;i+=2)
		{
			a[i]=s.charAt(i);
			a1[k]=a[i];
			k++;
		}
		for(i=1;i<l;i+=2)
		{
			b[i]=s.charAt(i);
		}
		k=0;
		for(i=1;i<l;i+=2)
		{
			c[k]=(b[i]-48);
			k++;
		}

		for(i=0;i<k;i++)
		{
			for(int j=0;j<c[i];j++)
			{
			System.out.print(a1[i]);
			}

		}
	}
}
