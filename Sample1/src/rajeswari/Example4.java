package rajeswari;

public class Example4 {
	public static void main(String[] args) {
		char a=args[0].charAt(0);
		char b=args[1].charAt(1);
		if(a>b)
			System.out.println(args[1]+","+args[0]);
		else
			System.out.println(args[0]+","+args[1]);
	}

}
