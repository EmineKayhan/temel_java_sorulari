package sorular;

public class soru02 {

	static int topla(int a) {
		if(a==1)return 1;
		return a+topla(a-1);
	}
	
	
	public static void main(String[] args) {
		// 1 ile 10 aras�ndaki say�lar�n ekrana yaz�l�p tplanmas�
		
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		
		System.out.println("1'den 10'a kadar olan say�lar�n toplam�:"+topla(10));
		
		
		

	}

}
