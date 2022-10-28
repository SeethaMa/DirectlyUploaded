package ifcondition;

public class WordsGreater {
	public static void main (String[]args) {
		String a="pen";
		String b="duster";
		String c="ac";
		if (a.length()<b.length()&&a.length()<c.length()) {
			System.out.println(a.toUpperCase()+" is Minimum");
		}
		else if (b.length()<c.length()&&b.length()<a.length()) {
			System.out.println(b.toUpperCase()+"  is Minimum");
	}
		else {
			System.out.println(c.toUpperCase()+" is Minimum");
		}

	}
}