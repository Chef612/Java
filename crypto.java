import java.util.*;
class crypto
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int l=s.length();
		char ch=s.charAt(l/2);
		int a=(int)ch;
		int k=(a*1027);
		int k1=k/l;
		System.out.println("your key is: "+k1);
		int a1=a+1;
		char c1=(char)a1;
		System.out.println(c1+""+k+""+c1);
System.out.println();


		System.out.println("Please enter your key to decrypt ");
		int k2=in.nextInt();
		if(k2!=k1){
			System.out.println("Invalid key!");
		}





	}
}


