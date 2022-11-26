package patjava101_21;
import java.util.Scanner;

public class patjava101_21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz: ");
		int a = scan.nextInt();		
		scan.close();
		
		int b;
		int c = 0;
		
		while(a != 0) {
			b = a % 10;
			c = c + b;
			a /= 10;
		}
		System.out.println(c);
		
	}

}
