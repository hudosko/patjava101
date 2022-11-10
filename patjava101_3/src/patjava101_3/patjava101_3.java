package patjava101_3;
import java.util.Scanner;
import java.lang.Math;

public class patjava101_3 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. Kenar uzunluğunu giriniz: ");
		float k1 = scan.nextFloat();
		System.out.println("2. Kenar uzunluğunu giriniz: ");
		float k2 = scan.nextFloat();
		System.out.println("3. Kenar uzunluğunu giriniz: ");
		float k3 = scan.nextFloat();
		
		float cevre = (k1+k2+k3)/2;
		double area = cevre*(cevre -k1)*(cevre-k2)*(cevre-k3);
		double alan = Math.sqrt(area);
		
		System.out.println("Üçgenin alanı: " + alan);
	}

}
