package manishsHw;

public class arraysAreEql1 {

	public static void main(String[] args) {
		String arr[]=new String[3];
		arr[0]="b";
		arr[1]="a";
		arr[2]="c";
		String arr2[]=new String[3];
		arr2[0]="a";
		arr2[1]="b";
		arr2[2]="c";
		
		if(arr.equals(arr2)) {
			System.out.println("arr equal to arr2");
		}else {
			System.out.println("arr not equal to arr2");
		}
	}

}
