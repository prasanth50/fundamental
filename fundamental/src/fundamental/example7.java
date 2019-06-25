package fundamental;

public class example7 {

	public static void main(String[] args) {
int i=0,l=args.length;
		
		if(l==0)
		{
			System.out.println("No values");
		}
		else
		{
			for(i=0;i<l;i++)
			{
					System.out.print(args[i]);
					if(i!=l-1)
					System.out.print(",");
			}	
		}

	}

}
