package patjava101_27;
import java.util.Scanner;
public class patjava101_27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Basamak sayısı giriniz: ");
		int num = scan.nextInt();
		scan.close();
				
		for(int i=num-1; i>0; i--) {
			
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}
}
