package manishsHw;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();

	}

	static void add() {
		Scanner a = new Scanner(System.in);
		System.out.println("add number 1");
		int q = a.nextInt();
		System.out.println("add number 2");
		int r = a.nextInt();
		int sum = q + r;

		System.out.println("sum is " + sum);

	}

	static void sub() {
		Scanner a = new Scanner(System.in);
		System.out.println("sub number 1");
		int q = a.nextInt();
		System.out.println("sub number 2");
		int r = a.nextInt();
		int sub = q - r;

		System.out.println("sub " + sub);

	}

	static void mul() {
		Scanner a = new Scanner(System.in);
		System.out.println("mul number 1");
		int q = a.nextInt();
		System.out.println("mul number 2");
		int r = a.nextInt();
		int mul = q * r;

		System.out.println("mul " + mul);

	}

	static void div() {
		Scanner a = new Scanner(System.in);
		System.out.println("div number 1");
		int q = a.nextInt();
		System.out.println("div number 2");
		int r = a.nextInt();
		int div = q / r;

		System.out.println("div " + div);

		a.close();
	}

}
