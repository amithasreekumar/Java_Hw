package manishsHw;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpHandling {

	public static void main(String[] args) {
		int arr[]=new int[3];
		Scanner s1=new Scanner(System.in);
		System.out.println("give 3 array inputs");
		 arr[0]=s1.nextInt();
		 arr[1]=s1.nextInt();
		 arr[2]=s1.nextInt();
		 //arr[3]=s1.nextInt();
		 try {
			 arr[3]=s1.nextInt();
		 }catch(ArrayIndexOutOfBoundsException a1) {
			 System.out.println("ArrayIndexOutOfBoundsException");
		 }catch(InputMismatchException i1) {
			 System.out.println("InputMismatchException");
		 }
		 
		System.out.println(Arrays.toString(arr));
		
		

	}

}
