package patjava101_26;
import java.util.Scanner;

public class patjava101_26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num = scan.nextInt();
		scan.close();
		
		int carp =0;
		
		for(int i =1; i<num; i++) {
			if(num%i == 0) {
				carp += i;
			}
		}
		if(carp == num) {
			System.out.println("Mükemmel sayıdır.");
		}else {
			System.out.println("Mükemmel sayı değildir.");
		}
	}
}
