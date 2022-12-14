package patjava101_34;
import java.util.Scanner;

public class patjava101_34 {
	
	static void fonk(int num, boolean bo, int temp) {
		
		if(bo && num > 0 && num<= temp) {
			System.out.print(num + " ");
			num -= 5;
			fonk(num, true, temp);
			
			if(num<=0) {
				fonk(num, false, temp);
				
			}
		}else if(bo == false && num<=temp) {
				System.out.print(num + " ");
				num += 5;
				fonk(num, false, temp);
			}
		}
		
		
		
		
		
		
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int num = scan.nextInt();
		scan.close();
		
		int temp = num;
		
		fonk(num, true, temp);
	}

}
