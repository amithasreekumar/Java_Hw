package manishsHw;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();

	}

	static Scanner a = new Scanner(System.in);

	static int q = a.nextInt();

	static int r = a.nextInt();

	static void add() {

		int sum = q + r;

		System.out.println("q+r= " + sum);

	}

	static void sub() {

		int sub = q - r;

		System.out.println("q-r= " + sub);

	}

	static void mul() {

		int mul = q * r;

		System.out.println("q*r= " + mul);

	}

	static void div() {

		int div = q / r;

		System.out.println("q/r= " + div);

		a.close();
	}

}
