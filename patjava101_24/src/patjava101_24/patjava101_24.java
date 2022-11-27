package patjava101_24;
import java.util.Scanner;

public class patjava101_24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz: ");
		int num1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		int num2 = scan.nextInt();
		scan.close();
		
		int ebob=1; int ekok=1;
		int i=1;
		
		while(i<=num1) {
			if(num1%i==0 && num2%i==0) {
				ebob = i;
			}
			i++;
		}
		
		System.out.println("Sayıların ebobu: " + ebob);
		
		int j = 1;
		while(j<=(num1*num2)){
			
			if(j%num1==0 && j%num2==0) {
				System.out.print("Sayıların ekoku: " + j);
				break;
			}
			
			j++;
			
		}

	
	
	
	}
	
}
