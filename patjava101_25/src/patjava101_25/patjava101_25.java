package patjava101_25;
import java.util.Scanner;

public class patjava101_25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kaç tane sayı gireceksiniz: ");
		int totalnum = scan.nextInt();
		
		int i=1;
		int max=0; int min=0;
		
		while(i<=totalnum) {
			
			System.out.println("Lütfen " + i +  ". sayıyı giriniz: ");
			int num = scan.nextInt();
			
			if(i==1) {
				max = num;
				min = num;
			}else if(num>max) {
				max = num;
			}else if(num<min) {
				min = num;
			}else {
				break;
			}
			i++;
		}
		scan.close();
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}
