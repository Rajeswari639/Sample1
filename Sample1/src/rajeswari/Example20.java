package rajeswari;

public class Example20 {
	public static void main(String[] args) {
		int rev=0,rem=0,n1=0,n=Integer.parseInt(args[0]);
		n1=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==n1)
			System.out.println(n1+" is a palindrome");
		else
			System.out.println(n1+" is not a palindrome ");
	}

}
