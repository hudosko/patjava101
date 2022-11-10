package patjava101_2;
import java.util.Scanner;

public class patjava101_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ürün fiyatını giriniz: ");
		float fiyat = scan.nextFloat();
		scan.close();
		
		
		float kdv = fiyat*18/100;
		float odv = fiyat*8/100;
		
		float yenifiyat;
		
		if (fiyat > 0 && fiyat <= 1000) {
			yenifiyat = fiyat + kdv;
		}else {
			yenifiyat = fiyat + odv;
				}
		System.out.println("KDV'li fiyat tutarı: " + yenifiyat);
	}

}
