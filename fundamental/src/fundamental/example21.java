package fundamental;

public class example21 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int s=0,r=0;
		int t=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(s==t)
System.out.println(t+" is a palindrome");
		else
			System.out.println(t+" is not a palindrome");

	}

}
