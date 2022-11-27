package patjava101_22;
import java.util.Scanner;

public class patjava101_22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int a = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=a; i++) { //her satır için
			
			for(int j=1; j<=(a-i); j++) { // n. noktaya gelene kadar boşluk koy, n'den bir eksik olsun ki oraya yıldız gelecek
				System.out.print(" ");				
			}
			for(int k=1; k<=(2*i-1); k++) { // n. noktaya yıldız koy
				System.out.print("*");
			}
			
			System.out.println(""); // alt satıra geçmek için 	
		} 
		
		for(int y=a-1; y>0; y--) { // her azalan alt satırlar için
		
			for(int t=1; t<=a-y; t++) {
				System.out.print(" ");
			}
			for(int z=1; z<=2*y-1; z++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
			
		}
	}
}
