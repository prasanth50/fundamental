package fundamental;

public class example18 {

	public static void main(String[] args) {
		int s=0,n=Integer.parseInt(args[0]);
		for(int i=0;n>0;i++)
		{
			s+=(n%10);
		n/=10;				
		}
		System.out.println(s);
	}

}
