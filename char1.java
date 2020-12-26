
import java.util.*;
public class char1
{
	public static void main(String[] args)
	{
	   Scanner in=new Scanner(System.in);
		System.out.println("Enter string");
		String s=in.next();
		int i;
		char x=' ',ch,ch1;
		int l=s.length();
		for(i=l-1;i>=0;i--)
		{
			System.out.println(""+s.charAt(i));

		}

	}
	System.out.println();
}
