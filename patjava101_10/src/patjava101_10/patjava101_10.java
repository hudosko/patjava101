package patjava101_10;
import java.util.Scanner;

public class patjava101_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Etkinlik önerisi için hava sıcaklığı derecesini giriniz: ");
		double sicak = scan.nextDouble();
		scan.close();
		
		if (sicak < 5) {
			System.out.println("Kayak");
		}else if (sicak < 15) {
			System.out.println("Sinema");			
		} else if (sicak < 25 ) {
			System.out.println("Piknik");
		}else {
			System.out.println("Yüzme");
		}
		
	}

}
