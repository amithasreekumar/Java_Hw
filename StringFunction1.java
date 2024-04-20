package manishsHw;

public class StringFunction1 {
	
	static void printName() {
	String name="Amitha";
	
	for (int i=0;i<name.length();i++) {
		System.out.println(name.charAt(i));
	}
	}
	
	static void printStatement() {
		String love=" I love my friends";
		
		for(int i=0;i<love.length();i++) {
			System.out.println(love.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		printName();
		printStatement();
		
	}

}
