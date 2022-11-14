package patjava101_17;
import java.util.Scanner;

public class patjava101_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		boolean tekmi = true;
		int total = 0;
		
		while(tekmi) {
			System.out.println("Lütfen sayı giriniz: ");
			int sayi = scan.nextInt();
			
			if (sayi%2 == 1) {
				tekmi = false;
			}
			if(sayi%4 == 0) {
				total += sayi;
			}
		}
		System.out.println("Girdiğiniz sayılardan 4ün katları olan sayıların toplamı: " + total);
		
	}
}
