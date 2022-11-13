package patjava101_13;
import java.util.Scanner;

public class patjava101_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dist = 0, age = 0, tip = 0;
		double prp = 0.10;
		double btotal;
		double indtotal = 0;
		double tiptotal = 0;
		
		
		System.out.println("Mesafeyi giriniz: ");
		dist = scan.nextInt();
		while(dist <0) {
			System.out.println("Hatalı veri girişi. Tekrar deneyiniz.");
			dist = scan.nextInt();
		}
		
		System.out.println("Yaşınızı giriniz: ");
		age = scan.nextInt();
		System.out.println("Yolculuk tipini seçiniz. 1 => Tek yön. 2 => Gidiş dönüş.");
		tip = scan.nextInt();
		
		
		
		btotal = dist * prp;
		
		if (age < 12) {
			indtotal = btotal/2;
		}else if (age<24 && age>12) {
			indtotal = btotal - btotal/10;
		}else if(age>24 && age <=65){
			indtotal = btotal;
		}
		else{
			indtotal = btotal - btotal*3/10;
		}
		
		if(tip == 2) {
			tiptotal = indtotal - indtotal/5; 
			System.out.println("tutar: " + tiptotal*2);
		}else {
			System.out.println("tutar: " + indtotal);
		}	
		
		
	}

}
