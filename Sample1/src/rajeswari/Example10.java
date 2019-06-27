package rajeswari;

public class Example10 {
 public static void main(String[] args) {
	char ch=args[0].charAt(0);
	if(ch>=65&&ch<=90)
		System.out.println(args[0]+"->"+args[0].toUpperCase());
	if(ch>=97&&ch<=122)
		System.out.println(args[0]+"->"+args[0].toLowerCase());
}

}
