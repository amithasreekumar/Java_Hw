package manishsHw;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		area();

	}
	static void area() {
		Scanner input= new Scanner(System.in);
	System.out.println("Enter the radius");
		int r=input.nextInt();
		double area= 3.14*r*r;
		System.out.println("area of the circle = "+ area);
		
	}

}
