package manishsHw;

public class ContainDigits {

	public static void main(String[] args) {
		String word = "5514325566fgsdfgsdf";
		int digits = 0;

		char arrword[] = word.toCharArray();

		for (int i = 0; i < arrword.length; i++) {
			
			boolean ans = Character.isAlphabetic(arrword[i]);
			if (ans == false) {
				digits++;
			}else {
				System.out.println("string contains alphabets");
				break;
			}
		}

		System.out.println(digits);

	}

}
