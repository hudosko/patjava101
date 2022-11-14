package patjava101_19;
import java.util.Scanner;

public class patjava101_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int comb = 0;
		System.out.println("Sayı giriniz: ");
		int ne = scan.nextInt();
		System.out.println("Sayı giriniz: ");
		int re = scan.nextInt();
		int i, z, t;
		int rez=1, nez=1, ort = 1, ortez = 1;
		
		for(i = 1; i<=ne; i++) {
			nez = nez *i;
		}		
		for(z=1; z<=re; z++) {
			rez = z*rez;			
		}
		ort = ne - re;
		for(t=1; t<=ort; t++) {
			ortez = t*ortez;
		}
		comb = nez / (rez * ortez);
		
		System.out.println("Kombinasyonun sonucu: "+comb);
	}

}
