package ifcondition;

public class SwitchArith {
	public static void main (String []args) {
		int no1=50;
		int no2=20;
		char operation='@';
		switch (operation) {
		case '+':System.out.println("The sum is:"+(no1+no2));
		break;
		case '-':System.out.println("The diff is:"+(no1-no2));
		break;
		case '*':System.out.println("The mul is:"+(no1*no2));
		break;
		case '/':System.out.println("The div is:"+(no1/no2));
		break;
		default:System.out.println("This is not an Arithmatic opration");
		break;
	}
	}
}
