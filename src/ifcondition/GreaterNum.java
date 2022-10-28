package ifcondition;

public class GreaterNum {
	public static void main (String[]args) {
		int no1=45;
		int no2=200;
		int no3=300;
		if (no1>no2&&no1>no3) {
			System.out.println("Number 1 is Greater");
		}
		else if (no2>no1&&no2>no3) {
			System.out.println("Number 2 is Greater");
		}
		else {
			System.out.println("Number 3 is Greater");
		}
			
	}
}
