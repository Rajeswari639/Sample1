package rajeswari;

public class Example9 {
	public static void main(String[] arg) {
		int age=20;
		if(arg[0].equals("Female") && (age>=1 && age<=58))
			System.out.println("percentage of interest is 8.2%");
		if(arg[0].equals("Female") && (age>=59 && age<=100))
			System.out.println("percentage of interest is 9.2%");
		if(arg[0].equals("male") && (age>=1 && age<=58))
			System.out.println("percentage of interest is 8.4%");
		if(arg[0].equals("male") && (age>=59 && age<=100))
			System.out.println("percentage of interest is 10.5%");
		
		
	}

}
