package patjava101_5;
import java.util.Scanner;

public class patjava101_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Boy uzunluğunuzu metre cinsinden giriniz: ");
		double boy = scan.nextDouble();
		System.out.println("Kilonuzu giriniz: ");
		double kilo = scan.nextDouble();
		
		scan.close();
		
		double ind = kilo/(boy*boy);
		System.out.println("Vücut kitle endeksiniz: " +ind);
	}

}
