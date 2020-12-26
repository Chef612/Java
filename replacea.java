import java.util.*;
class replacea
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String ss=in.nextLine();
		String rs=in.nextLine();
		String str=s.replaceAll(ss,rs);
		System.out.print(str);
	}
}