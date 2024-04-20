package manishsHw;

public class GlobalVar {

	int g=100;
	
	public static void main(String[] args) {
		GlobalVar g1=new GlobalVar();
		g1.add();
	}
	void add() { 
		g=120;
		int a=10;
		System.out.println(a+g);
	}

}
