package manishsHw;

public class SIB_IIB2 {
	
	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");

	}
	SIB_IIB2(){
		System.out.println("Constructor ");
	}
	
	public static void main(String[] args) {
		System.out.println("method");
		new SIB_IIB2();
		new SIB_IIB2();


	}
}
