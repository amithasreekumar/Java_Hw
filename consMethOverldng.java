package manishsHw;

public class consMethOverldng {

	public static void main(String[] args) {
		
		consMethOverldng obj1= new consMethOverldng('I');
		new consMethOverldng("Hello world ");
		meth();
		obj1.meth(2);
	}

	public consMethOverldng(char a) {
		System.out.println("constructor 1 " + a);

	}
	consMethOverldng(String a){
		System.out.println(a + "constructor 2 ");
	}
	
	public static void meth() {
		System.out.println("meth1 ");
	}
	
	public void meth(int a) {
		int x=a*2;
		System.out.println(x + "meth2");
	}

}
