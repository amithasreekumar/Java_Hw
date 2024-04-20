package manishsHw;

public class PrintNum4 {

	public static void main(String[] args) {
		
	for(int i=1;i<=365;i++) {
		if(i>=1 && i<=31) {
			System.out.println("Jan");
		}else if(i>32 && i<=60) {
			System.out.println("Feb");
		}else if(i>60 && i<=91) {
			System.out.println("Mar");
		}else if(i>91 && i<=121) {
			System.out.println("April");
		}else if(i>121 && i<=152) {
			System.out.println("May");
		}else if(i>152 && i<=181) {
			System.out.println("June");
		}else if(i>181 && i<=212) {
			System.out.println("Jul");
		}else if(i>212 && i<=243) {
			System.out.println("Aug");
		}else if(i>243 && i<=273) {
			System.out.println("Sep");
		}else if(i>273 && i<=304) {
			System.out.println("Oct");
		}else if(i>304 && i<=334) {
			System.out.println("Nov");
		}else if(i>334 && i<=365) {
			System.out.println("Dec");
		}
		
	}
	}

}
