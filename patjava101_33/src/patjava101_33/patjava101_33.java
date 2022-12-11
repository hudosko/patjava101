package patjava101_33;
import java.util.Scanner;

public class patjava101_33 {
	
	static void asal(int num){
		int count = 0;
		
		for(int i = 1; i<=num; i++) {
			if(num%i == 0) {
				count++;
			}
		
		}
		
		if(count > 2) {
			System.out.println("Asal sayı değildir.");
		}else {
			System.out.println("Asal sayıdır.");
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayı giriniz: ");
		int num = scan.nextInt();
		
		asal(num);
	}

}
