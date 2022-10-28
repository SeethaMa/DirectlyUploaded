package ifcondition;

public class AgeBased {
	public static void main (String[]args) {
		int age =13;
		if (age<0&&age<=12) {
			System.out.println("You're a Child");
		}
		else if (age>=13&&age<=19) {
			System.out.println("You're a Teenager");
		}
		else if (age>=20&&age<=45) {
			System.out.println("You're a Adult");
		}
		else {
			System.out.println("You're a Senior Citizen");
		}
	}

}
