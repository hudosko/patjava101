package patjava101_23;
import java.util.Scanner;

public class patjava101_23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hesap oluşturmak için kullanıcı adı giriniz: ");
		String adi = scan.next();
		System.out.println("Yeni bir şifre giriniz: ");
		String sifre = scan.next();
		System.out.print("Tebrikler. Kullanıcı oluşturuldu. Giriş yapmak için 1'i, kapatmak için 2'yi tuşlayınız: ");
		
		
		int sec = scan.nextInt();
		
		if(sec ==1) {
			int i=0;
			
				while(i<=3) {
					System.out.println("Lütfen kullanıcı adınızı giriniz: ");
					String kuladi = scan.next();
					System.out.println("Lütfen şifrenizi giriniz: ");
					String kulsifre = scan.next();
					
					if(kuladi.equals(adi) && kulsifre.equals(sifre)){
						System.out.println("Giriş başarılı.");
						break;
					}else if(i==2){
						
						System.out.println("Hesabınız bloke edildi.");
						break;
				}else {
					System.out.println("Giriş hatalı. Lütfen tekrar deneyiniz. 3 yanlış girişten sonra hesabınız bloke edilecektir. ");
					i++;
				}
					
			}
				int bakiye = 0;
				int islemnum = 0;
				
				while(islemnum != 4){
					
					System.out.println("Yapmak istediğiniz işlemi seçiniz: \n 1- Para çekme. \n 2- Para yatırma. \n 3-Bakiye sorgulama \n 4-Çıkış");
					islemnum = scan.nextInt();
					
					switch(islemnum) {
					case 1: 
						System.out.println("Lütfen çekmek istediğiniz miktarı giriniz: ");
						int num1 = scan.nextInt();
						bakiye = bakiye - num1;
						System.out.println("\n İşlem başarılı. \n ***** \n");
						break;
					case 2:
						System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz: ");
						int num2 = scan.nextInt();
						bakiye = bakiye + num2;
						System.out.println("\n İşlem başarılı. \n ***** \n");
						break;
					case 3:
						System.out.println("Mevcut bakiyeniz: " + bakiye +  " \n ");
						break;
					case 4:
						System.out.println("Çıkış yapıldı.");
						break;
					}
					
				}	
			
		}else {
			System.out.println("Hoşçakalın.");
		}
	}
}
