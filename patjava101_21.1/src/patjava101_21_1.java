import java.util.Scanner;

public class patjava101_21_1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = scan.nextInt();
		scan.close();
	
		double res = 0.0;
		
		for(double i=1; i<=sayi; i++) {
			res += (1.0/i);			
		}
		
		System.out.println(res);
		
	}

}
