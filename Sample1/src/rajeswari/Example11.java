package rajeswari;

public class Example11 {
	public static void main(String[] args) {
	char color=args[0].charAt(0);
	switch(color)
	{
	case 'R':
		System.out.println("R=>Red");
		break;
	case 'B':
		System.out.println("B=>Blue");
		break;
	case 'G':
		System.out.println("G=>Green");
		break;
	case 'O':
		System.out.println("O=>orange");
		break;
	case 'Y':
		System.out.println("Y=>Yellow");
		break;
	case 'w':
		System.out.println("W=>white");
		break;
	default:
		System.out.println("invalid code");
		break;
	}
	
	}

}
