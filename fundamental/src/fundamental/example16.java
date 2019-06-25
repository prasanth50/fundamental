package fundamental;

public class example16 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
	    int c=0;
	    if(n==0||n==1)
    		System.out.println(n+" is neither prime nor composite");
	    else
	    {
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				c++;
		}
        if(c>0)
        {
        	System.out.println(n+" is a composite number");
        }
		else
		{
			System.out.println(n+" is a prime number");
	}
	}
	}
}
