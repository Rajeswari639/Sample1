package rajeswari;

public class Example17 {
	public static void main(String[] args) {
		int sum=0,i=0,n=Integer.parseInt(args[0]);
		for(i=0;n>0;i++) {
			sum=sum+(n%10);
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
