package patjava101_4;
import java.util.Scanner;

public class patjava101_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double pi = 3.14;
		System.out.println("Yarıçapı giriniz: ");
		double radi = scan.nextDouble();
		System.out.println("Dilim açı ölçüsünü giriniz: ");
		double alfa = scan.nextDouble();
		scan.close();
		double area = pi*alfa*radi*radi/360;
		System.out.println("Daire diliminin alanı: " + area);		
	}
}
