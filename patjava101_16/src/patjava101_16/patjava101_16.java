package patjava101_16;
import java.util.Scanner;

public class patjava101_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int sayi = scan.nextInt();
		scan.close();
		int cvp = 0;
		int ort = 0;
		
		for(int z= 1; z<sayi; z++) {
			if (z%3 !=0 || z%4 !=0) {
				continue;
			}
			cvp += z;
			ort += 1;			
		}
		
		System.out.print(cvp/ort);
	}
	
}
