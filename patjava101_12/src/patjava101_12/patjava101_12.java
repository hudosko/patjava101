package patjava101_12;
import java.util.Scanner;

public class patjava101_12{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Doğum ayınızı giriniz");
		int ay = scan.nextInt();
		System.out.println("Doğum gününüzü giriniz");
		int gun = scan.nextInt();
		
		String burc;
		
		if(ay == 1 && gun > 21) {
			burc = "kova";			
		}else if(ay == 1 && gun < 22){
			burc = "Oğlak";
		}else if(ay == 2 && gun > 19) {
			burc = "Balık";			
		}else if(ay == 2 && gun < 20){
			burc = "Kova";
		}else if(ay == 3 && gun > 20) {
			burc = "Koç";			
		}else if(ay == 3 && gun < 21){
			burc = "Balık";
		}else if(ay == 4 && gun > 20) {
			burc = "Boğa";		
		}else if(ay == 4 && gun < 21) {
			burc = "Koç";
		}else if(ay == 5 && gun > 21){
			burc = "Boğa";
		}else if(ay == 5 && gun > 21) {
			burc = "İkizler";			
		}else if(ay == 6 && gun < 22){
			burc = "İkizler";
		}else if(ay == 6 && gun > 22) {
			burc = "Yengeç";			
		}else if(ay == 7 && gun < 23){
			burc = "Yengeç";
		}else if(ay == 7 && gun > 22) {
			burc = "Aslan";			
		}else if(ay == 8 && gun < 23){
			burc = "Aslan";
		}else if(ay == 8 && gun > 22) {
			burc = "Başak";			
		}else if(ay == 9 && gun < 23){
			burc = "Başak";
		}else if(ay == 9 && gun > 22) {
			burc = "Terazi";			
		}else if (ay == 10 && gun < 23){
			burc = "Terazi";
		}else if(ay == 10 && gun > 22) {
			burc = "Akrep";			
		}else if(ay == 11 && gun < 23) {
			burc = "Akrep";
		}else if(ay == 11 && gun > 21) {
			burc = "Yay";			
		}else if(ay ==12 && gun < 22){
			burc = "Yay";
		}else if(ay == 12 && gun > 20) {
			burc = "Oğlak";			
		}else {
			burc = "Oğlak";
		}
		
		System.out.println("Burcunuz: " + burc);
	}
	

}
