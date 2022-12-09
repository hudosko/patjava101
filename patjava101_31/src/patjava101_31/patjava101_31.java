package patjava101_31;
import java.util.Scanner;

public class patjava101_31 {
	
	static void top() {
		System.out.println("0 girildiğinde sonuç alınacaktır.");
		Scanner scan = new Scanner(System.in);
		int sayi, result = 0;
		int i = 1;
		
		while(true) {
			
			System.out.println(i++ + ". sayı: ");
			sayi = scan.nextInt();
			
			if (sayi == 0) {
				break;
				
			}
			result += sayi;
			
		}
		System.out.println("Sonuç= " + result);
		scan.close();
		
	}
	
	static void cik() {
		System.out.println("Çıkarılacak sayıyı giriniz: ");
		Scanner scan = new Scanner(System.in);
		int say = scan.nextInt();
		int sayi, result = 0;
		int i = 1;
		
		while(true) {
			
			System.out.println(i++ + ". sayı: ");
			sayi = scan.nextInt();
			
			if(sayi == 0) {
				break;
			}
			result -= sayi;
			
		}
		result += say;
		System.out.println("Sonuç= " + result);
		scan.close();
	}
	
	static void carp() {
		
		Scanner scan = new Scanner(System.in);
		int sayi, result = 1;
		
		while(true) {
			System.out.println("Çarpılacak sayıları giriniz: ");
			sayi = scan.nextInt();
			
			if(sayi == 0) {
				break;
			}
			result *= sayi;
		}
		System.out.println("Sonuç= " + result);
		scan.close();
	}
	
	static void bol() {
		System.out.println("Bölünecek sayıyı giriniz: ");
		Scanner scan = new Scanner(System.in);
		int say = scan.nextInt();
		int sayi, result = 1; 
		int carps = 1;
		
		
		while(true){
			System.out.println("Bölecek sayıları giriniz: ");
			sayi = scan.nextInt();
		
			if(sayi == 0) {
				break;
			}
			carps *= sayi;
			
		}
		result = say / carps;
		System.out.println("Sonuç= " + result);
		scan.close();
		
	}
	
	static void uslu() {
		System.out.println("Sayıyı giriniz: ");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		System.out.println("Üssü giriniz: ");
		int uslu = scan.nextInt();
		int result = 1;
		
		
		for(int i = 1; i <= uslu; i++) {
			result = result * sayi;
		}
		
		System.out.println("Sonuç= " + result);
		scan.close();
		
	}
	
	static void fak() {
		System.out.println("Sayıyı giriniz: ");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		int result = 1;
		
		for(int i = 1; i<= sayi; i++) {
			result *= i;
		}
		System.out.println("Sonuç= " + result);
		scan.close();
		
	}
	
	static void mod() {
		System.out.println("1. sayıyı giriniz: ");
		Scanner scan = new Scanner(System.in);
		int sayi1 = scan.nextInt();
		System.out.println("2. sayıyı giriniz: ");
		int sayi2 = scan.nextInt();
		int result = 1;
		
		result = (sayi1 % sayi2);
		System.out.println("Sonuç= " + result);
		scan.close();
		
	}
	
	static void dik() {
		
		System.out.println("1. sayıyı giriniz: ");
		Scanner scan = new Scanner(System.in);
		int sayi1 = scan.nextInt();
		System.out.println("2. sayıyı giriniz: ");
		int sayi2 = scan.nextInt();
		int result1 = 1, result2 = 1;
		
		result1 = (sayi1 + sayi2)*2;
		result2 = sayi1*sayi2;
		
		
		System.out.println("Dikdörtgenin çevresi: " + result1);
		System.out.println("Dikdörtgenin alanı: " + result2);
		scan.close();
		
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			
		String menu = "\n 1- Toplama işlemi"
				+ "\n 2- Çıkarma işlemi"
				+ "\n 3- Çarpma işlemi"
				+ "\n 4- Bölme işlemi"
				+ "\n 5- Üslü sayı hesaplama"
				+ "\n 6- Faktoriyel hesaplama"
				+ "\n 7- Mod alma"
				+ "\n 8- Dikdörtgen alan ve çevre hesabı";
		
		System.out.println("Yapmak istediğiniz işlemi seçiniz: " + menu);
		int select = scan.nextInt();
		scan.close();
		
		switch(select) {
		case 1: 
			top();
		case 2:
			cik();
		case 3:
			carp();
		case 4:
			bol();
		case 5:
			uslu();
		case 6:
			fak();
		case 7:
			mod();
		case 8:
			dik();
		} 
				
	}

}
