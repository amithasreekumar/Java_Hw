package manishsHw;

public class MethOverloading {

	public static void main(String[] args) {

		login(3,1.2,3);
		login(5,5,5.5);
		 MethOverloading obj=new MethOverloading();
		obj.login(2.3,56,9);
		obj.login('C',"five");

		
	}

	static void login(int a, int b, double c) {
		System.out.println( a+b+c+ ",1");
	}

	void login(double a, int b, int c) {
		System.out.println(a+b+c);
	}

	static void login(int a, double b, int c) {
		System.out.println( a+b+c +",3");
	}


	void login(char a, String b) {
		System.out.println("5 "+ a+b);
	}

}
