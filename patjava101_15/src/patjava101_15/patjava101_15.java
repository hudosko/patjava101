package patjava101_15;
import java.util.Scanner;

public class patjava101_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yıl giriniz: ");
		int yil = scan.nextInt();
		scan.close();
		
		
		if(yil %100 == 0) {
			if(yil % 400 == 0) {
				System.out.println("Artik yıl");
			}else {
				System.out.println("Artik yıl değil");
			}
			
		}else if(yil %4 == 0) {
			System.out.println("Artık yıl");
		}else {
			System.out.println("Artık yıl değil.");
		}
	
		
	}
}
