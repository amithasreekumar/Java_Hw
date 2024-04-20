 package manishsHw;

public class NestedIfElse {

	public static void main(String[] args) {
		int age=90;
		if(age>=10) {
			if(age<=18) {
				System.out.println("student- ticket rate is 80rs");
			}else {
				if(age>60) {
					System.out.println("senior- ticket rate is 80rs");
				}else {
					System.out.println("adult- ticket rate is 110rs");
				}
				
			}
			
		}else {
			System.out.println("child- ticket rate is 50rs");
		}

	}

}
