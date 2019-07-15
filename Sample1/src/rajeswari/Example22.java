package rajeswari;

public class Example22 {
	public static void main(String[] args) {
		{
			if(args.length==0)
			{
			System.out.println("Please enter an integer number");
			}
			else
			{
			int n=Integer.parseInt(args[0]);
			int i,j;
			for(i=0;i<n;i++)
			{
			for(j=0;j<=i;j++)
			{
			System.out.print("* ");
			}
			System.out.print("\n");
			}
			}
       }
}
}