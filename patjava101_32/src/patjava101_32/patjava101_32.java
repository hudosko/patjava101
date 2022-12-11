package patjava101_32;

public class patjava101_32 {
	
	static int uslu(int sayi, int us) {
		
		if(us<1) {
			return 1;
		}else {
			return sayi * uslu(sayi, us-1);
		}
	}

	
	public static void main(String[] args) {
		
		System.out.println(uslu(2, 3));
	}
}
