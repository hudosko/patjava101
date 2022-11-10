package patjava101_7;
import java.util.Scanner;

public class patjava101_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("İlk sayıyı giriniz: ");
		int i1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		int i2 = scan.nextInt();
		
		System.out.println("Yapmak istediğiniz işlemi seçiniz. \n 1-Toplama \n 2-Çıkarma \n 3- Çarpma \n 4-Bölme ");
		int sec = scan.nextInt();
		scan.close();
		
		int son;
		
		switch (sec) {
			case 1: son = i1 + i2; System.out.print(son); break;
			case 2: son = i1 - i2; System.out.print(son); break;
			case 3: son = i1 * i2; System.out.print(son); break;
			case 4: son = i1 / i2; System.out.print(son); break;
		}

	}
}
