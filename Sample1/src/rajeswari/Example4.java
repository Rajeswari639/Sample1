package rajeswari;

public class Example4 {
	public static void main(String[] args) {
		char t=args[0].charAt(0);
		char u=args[1].charAt(1);
		if(t>u)
			System.out.println(args[1]+","+args[0]);
		else
			System.out.println(args[0]+","+args[1]);
	}


}
