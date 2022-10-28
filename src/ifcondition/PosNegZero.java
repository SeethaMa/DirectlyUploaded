package ifcondition;

public class PosNegZero {
	public static void main (String[]args) {
		int no=9;
		if (no>0) {
			System.out.println(no+" is positive");
		}
		else if(no==0) {
			System.out.println(no+" is zero");
		}
		else {
			System.out.println(no+" is negative");
		}
	}

}
