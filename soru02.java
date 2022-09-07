package sorular;

public class soru02 {

	static int topla(int a) {
		if(a==1)return 1;
		return a+topla(a-1);
	}
	
	
	public static void main(String[] args) {
		// 1 ile 10 arasýndaki sayýlarýn ekrana yazýlýp tplanmasý
		
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		
		System.out.println("1'den 10'a kadar olan sayýlarýn toplamý:"+topla(10));
		
		
		

	}

}
