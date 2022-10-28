package ifcondition;

public class StrContains {
	public static void main (String[]args) {
		String word="apple";
		if (word.contains("a")||word.contains("e")||word.contains("i")||word.contains("o")||word.contains("u")) {
			System.out.println(word+" contains vowel");
		}
		else {
			System.out.println(word+" not contains vowel");
		}
	}

}
