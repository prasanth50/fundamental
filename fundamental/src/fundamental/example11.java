package fundamental;

public class example11 {

	public static void main(String[] args) {
char c=args[0].charAt(0);
		
		if(c>=65&&c<=90)
			System.out.println(args[0]+"->"+args[0].toLowerCase());
		else
		
		if(c>=97&&c<=122)
			System.out.println(args[0]+"->"+args[0].toUpperCase());

	}

}
