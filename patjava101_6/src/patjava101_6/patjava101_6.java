package patjava101_6;
import java.util.Scanner;

public class patjava101_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5.0;
		
		System.out.println("Kaç kilo armut? ");
		double arm = scan.nextDouble();
		System.out.println("Kaç kilo elma? ");
		double elm = scan.nextDouble();
		System.out.println("Kaç kilo domates? ");
		double dom = scan.nextDouble();
		System.out.println("Kaç kilo muz? ");
		double mu = scan.nextDouble();
		System.out.println("Kaç kilo patlıcan? ");
		double pat = scan.nextDouble();
		
		scan.close();
		
		double tutar = arm*armut + elm*elma + dom*domates + mu*muz + pat*patlican;
		
		System.out.println("Toplum tutar: " + tutar + " TL");
		
	}

}
