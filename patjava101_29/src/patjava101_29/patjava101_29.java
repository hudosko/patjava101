package patjava101_29;
import java.util.Scanner;

public class patjava101_29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num = scan.nextInt();
		scan.close();
		
		int a1 = 0; int a2 =1; int a3;
		
		System.out.print(a1 + " ");
		System.out.print(a2);
		
		for(int i=1; i<num; i++) {
			a3= a2+a1;
			System.out.print(" " + a3);
			a1 = a2;
			a2= a3;
			
		}
	}
}
