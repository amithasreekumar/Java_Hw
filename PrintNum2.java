package manishsHw;

public class PrintNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <= 500; a++) {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println("computer & mouse");

			}
			if (a % 5 == 0) {
				System.out.println("mouse ");
			} else if (a % 3 == 0) {
				System.out.println("computer");

			} else {
				System.out.println(a);
			}
		}
	}

}
