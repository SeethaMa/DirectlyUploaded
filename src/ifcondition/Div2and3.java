package ifcondition;

public class Div2and3 {
	public static void main (String[]args) {
		int num=18;
		if (num%2==0 && num%3==0) {
			System.out.println(num+" is divisible by 2 and 3.");
		}
		else {
			System.out.println(num+" is not divisible by 2 and 3.");
		}
	}

}


