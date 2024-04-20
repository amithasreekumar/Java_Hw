package manishsHw;

public class loop {

	public static void main(String[] args) {

	/*	for(int i=0;i<=10;i++) {
		System.out.println(i);
		 }

		 for(int i=-10;i<=0;i++) {
		System.out.println(i);
		 }

		 for(int i=-100;i>=-110;i--) {
		System.out.println(i);
		 }

		 for(int i=0;i<10;i--) {
		System.out.println(i);
		 }

		 for(int i=100;i>10;i++) {
		System.out.println(i);
		 }
*/
		rectangle(4, 9);
		square(5);
		circle(2);
		triangle(10, 6, 8);

	}

	public static void rectangle(int a, int b) {
		int cir = 2 * a + 2 * b;
		System.out.println("Circumference of rectangle = " + cir);
	}

	public static void square(int a) {
		int cir = 4 * a;
		System.out.println("Circumference of square = " + cir);
	}

	public static void circle(int r) {
		double cir = 2 * 3.14 * r;
		System.out.println("Circumference of circle = " + cir);
	}

	public static void triangle(int a, int b, int c) {
		int cir = a + b + c;
		System.out.println("Circumference of triangle = " + cir);
	}

//	public static void rectangle(int a, int b) {
//		int area= a*b;
//		System.out.println("Area of rectangle = " + area);
//	}
//	
//	public static void square(int a) {
//		int area= a*a;
//		System.out.println("Area of square = " + area);
//	}
//	
//	public static void circle(int r) {
//		double area= 3.14 * r *r ;
//		System.out.println("Area of circle = " + area);
//	}
//	
//	public static void triangle(int a, int b) {
//		double area= 0.5*a*b;
//		System.out.println("Area of triangle = " + area);
//	}

}
