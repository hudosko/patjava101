package patjava101_20;
import java.util.Scanner;

public class patjava101_20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayıyı giriniz: ");
		int sayi = scan.nextInt();
		System.out.println("Üssü giriniz: ");
		int us = scan.nextInt();
		int uslusayi = 1;
		
		for(int i = 1; i<=us; i++) {
			uslusayi *= sayi;
			
		}
		System.out.println(uslusayi);
	}
}
