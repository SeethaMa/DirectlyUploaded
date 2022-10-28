package ifcondition;

public class GradeCond {
	public static void main(String[]args) {
		int mark=Integer.parseInt(args[0]);
		if (mark>=90&&mark<=100) {
			System.out.println("A GRADE");
		}
		else if (mark>=80&&mark>=79) {
			System.out.println("B GRADE");
		}
		else if (mark>=70&&mark>=69) {
			System.out.println("C GRADE");
		}
		else if (mark>=60&&mark>=59) {
			System.out.println("D GRADE");
		}
		else if (mark>=50&&mark>=49) {
			System.out.println("E GRADE");
		}
		else {
			System.out.println("Fail");
		}

}
}