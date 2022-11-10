package patjava101_1;
import java.util.Scanner;

public class patjava101_1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
			
		
		System.out.println("Tarih dersi notunu giriniz: ");
		float ta = scan.nextFloat();
		System.out.println("Müzik dersi notunu giriniz: ");
		float mu = scan.nextFloat();
		System.out.println("Matematik dersi notunu giriniz: ");
		float ma = scan.nextFloat();
		System.out.println("Fizik dersi notunu giriniz: ");
		float f = scan.nextFloat();
		System.out.println("Kimya dersi notunu giriniz: ");
		float k = scan.nextFloat();
		System.out.println("Türkçe dersi notunu giriniz: ");
		float tu = scan.nextFloat();
		
		scan.close();	
		
		float ortalama = ((ta + mu + ma + f + k + tu) / 6);
		
		String sonuc;		
		sonuc = (ortalama >= 60) ? "Geçti" : "Kaldı";
		
		System.out.println("Tüm derslerin ortalaması: " + ortalama);
		System.out.println(sonuc);

		
		
	}

}
