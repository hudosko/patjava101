package javapat101_14;
import java.util.Scanner;

public class javapat101_14 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Doğum tarihinizi giriniz: ");
		int dt = scan.nextInt();
		scan.close();
		int zod = dt %12;
		
		if(zod == 0) {
			System.out.println("Maymun");
		}else if(zod == 1) {
			System.out.println("Horoz");
		}else if(zod == 2) {
			System.out.println("Köpek");
		}else if(zod == 3) {
			System.out.println("Domuz");
		}else if(zod == 4) {
			System.out.println("Fare");
		}else if(zod == 5) {
			System.out.println("Öküz");
		}else if(zod == 6) {
			System.out.println("Kaplan");
		}else if(zod == 7) {
			System.out.println("Tavşan");
		}else if(zod == 8) {
			System.out.println("Ejderha");
		}else if(zod == 9) {
			System.out.println("Yılan");
		}else if(zod == 10) {
			System.out.println("At");
		}else{
			System.out.println("Koyun");
		}
		
	}

}
