package patjava101_30;

public class patjava101_30 {
	
	static boolean isPalindrom(int num) {
		int temp = num;
		int reversenum = 0;
		int lastnum;
		
		while(temp !=0) {
			lastnum = temp % 10;
			reversenum = (reversenum * 10) + lastnum;
			temp /= 10;
		}
		
		if(temp == num) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(isPalindrom(8382));
	}

}
