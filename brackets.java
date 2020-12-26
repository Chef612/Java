import java.util.*;
class brackets
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		String S=in.nextLine();
		int l=S.length();
		//String a[]=new String[l];
		int c=0;
		for(int i=0;i<l;i++)
		{
			char ch=S.charAt(i);
			if(ch=='(')
			{
				c++;
			}
			if(ch==')')
			{
				c--;
			}
		}
		if(c==0)
		{
			System.out.print(1);
		}
		if(c!=0)
		{
			System.out.print(-1);
		}
	}
}
