package patjava101_9;
import java.util.Scanner;

public class patjava101_9 {
	
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		int sayi = 0;
		int ort = 0;
		
		System.out.println("Matematik notunu giriniz: ");
		int mat = scan.nextInt();
		System.out.println("Türkçe notunu giriniz: ");
		int tur = scan.nextInt();
		System.out.println("Müzik notunu giriniz: ");
		int muz = scan.nextInt();
		System.out.println("Fizik notunu giriniz: ");
		int fiz = scan.nextInt();
		System.out.println("Kimya notunu giriniz: ");
		int kim = scan.nextInt();
		
		scan.close();
		
		ort = (mat + tur + muz + fiz + kim)/5;
		
		if (mat<0 || mat >100) {
			System.out.println("Geçersiz not");
		}else {
			ort = ort + mat;
			sayi++;	
		}
		if (kim<0 || kim >100) {
			System.out.println("Geçersiz not");
		}else {
			ort = ort + kim;
			sayi++;	
		}
		if (fiz<0 || fiz >100) {
			System.out.println("Geçersiz not");
		}else {
			ort = ort + fiz;
			sayi++;	
		}
		if (tur<0 || tur >100) {
			System.out.println("Geçersiz not");
		}else {
			ort = ort + tur;
			sayi++;	
		}
		if (muz<0 || muz >100) {
			System.out.println("Geçersiz not");
		}else {
			ort = ort + muz;
			sayi++;	
		}
		
		ort = ort / sayi;
		
		System.out.println("Not ortalamanız: " + ort);
		String gec;
		gec = (ort < 55) ? "Kaldı" : "Geçti";
		System.out.print(gec);
		
		
		
		
		
	}
	

 }