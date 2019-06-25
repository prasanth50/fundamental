package fundamental;

public class example22 {

	public static void main(String[] args) {
		int i=1,count=0;
		while(i>0)
		{
			if(count<5)
			{
				if(i%2==0 && i%3==0 && i%5==0)
				{
					System.out.println(i);
					count++;
				}
			}
			else
				break;
			i++;
		}

	}

}
