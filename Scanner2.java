package manishsHw;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int i= num.nextInt();
		System.out.println("Enter 2nd number");
		int j= num.nextInt();
		
		for (int a=i;a<=j;a++) {
			System.out.println(a);
		}

	}

}
