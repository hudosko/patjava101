package patjava101_18;
import java.util.Scanner;
import java.math.*;		

public class patjava101_18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scan.nextInt();
		int z, t;
		
		System.out.println("4'ün kuvvetleri: ");
		for(z = 1; z<sayi; z*=4) {
			System.out.println(z);
			
		}
		System.out.println("5'in kuvvetleri: ");
		for (t = 1; t<sayi; t*=5){
			
			System.out.println(t);
		}	
		
	}
}
