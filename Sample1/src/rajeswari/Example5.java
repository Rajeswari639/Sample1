package rajeswari;

public class Example5 {
	public static void main(String[] arg) {
		int i=0,count=0,n=Integer.parseInt(arg[0]);
		for(i=1;i<=n;i++) {
			if(n%i==0)
					count++;
		}
		if(count==2) 
			System.out.println("Gven number is " + n +  "  prime");
		else 
			System.out.println("Given number is " + n +  " not prime");
	
				
	
	}

}
