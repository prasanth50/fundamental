package fundamental;

public class example20 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int s=0,r=0;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
System.out.println(s);
	}

}
