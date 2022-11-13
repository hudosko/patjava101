package patjava101_11;
import java.util.Scanner;

public class patjava101_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. sayıyı giriniz: ");
		int a = scan.nextInt();
		System.out.println("2. sayıyı giriniz: ");
		int b = scan.nextInt();
		System.out.println("3. sayıyı giriniz: ");
		int c = scan.nextInt();
		
		if (a > b && a > c) {
			if (b > c) {
				System.out.println(a + " > " + b + " > " + c);
			} else {
				System.out.println(a + " > " + c + " > " + b);
			}
		}
		if (b > a && b > c) {
			if (a > c) {
				System.out.println(b + " > " + a + " > " + c);
			} else {
				System.out.println(b + " > " + c + " > " + a);
			}
		}
		if (c > b && c > a) {
			if (b > a) {
				System.out.println(c + " > " + b + " > " + a);
			} else {
				System.out.println(c + " > " + a + " > " + b);
			}
		}
	}
}
