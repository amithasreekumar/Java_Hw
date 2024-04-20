package manishsHw;

public class FinalGlobal4 {
	final double pi=3.14;
	
	public static void main(String[] args) {
		FinalGlobal4 g=new FinalGlobal4();
		g.area(5);
	}
	
	void area(int r) {
		double a=pi*r*r;
		System.out.println(a);
	}

}
