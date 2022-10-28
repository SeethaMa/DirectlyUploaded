package ifcondition;

public class SwitchEx {
	public static void main (String[]args) {
		char letter = 'b';
		switch (letter) {
		case 'a': System.out.println("Apple");
				break;
		case 'b': System.out.println("Ball");
				break;		
		case 'c': System.out.println("Cat");
				break;
		default:System.out.println("It is other alphabet");
				break;
		}
	}

}
