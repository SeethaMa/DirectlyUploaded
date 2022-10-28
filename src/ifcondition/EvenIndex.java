package ifcondition;

public class EvenIndex {
	public static void main(String[] args) {
		String [] word = {"aa","bb","cc","dd","ee"};
		for (int i=0;i<word.length;i++) {
			if (i==0) {
				continue;
			}
			if (i%2==0) {
				System.out.println(word[i].toUpperCase());
			}
		}
	}

}
