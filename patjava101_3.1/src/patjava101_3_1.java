import java.util.Scanner;

public class patjava101_3_1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Taksi ile kaç km yolculuk yapıldığını giriniz: ");
		
		
		Double km = scan.nextDouble();
		scan.close();
		
		double kmb = 2.20;
		double fiyat = km*kmb;
		
		fiyat += 10;
		fiyat = (fiyat <= 20)? 20:fiyat;
		
		
		System.out.println("Taksimetre ücreti: "+ fiyat);
		
	}

}
