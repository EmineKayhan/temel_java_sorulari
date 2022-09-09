package sorular;

import java.util.Scanner;

public class soru04 {

	public static void main(String[] args) {
		// kullanýcýdan alýnacak iki sayý aralýðýndaki kullanýcýnýn istediði sayýya bölünebilen sayýlarý bulan program
		
		Scanner scan = new Scanner(System.in);
		int baslangýc,bitis,bolen;
		
		System.out.println("baþlangýç sayýsýný giriniz: ");
		baslangýc=scan.nextInt();
		System.out.println("bitis sayýsýný giriniz: ");
		bitis=scan.nextInt();
		System.out.println("hangi sayýya bölünsün: ");
		bolen=scan.nextInt();
		
		for(int i=baslangýc;i<bitis;i++) {
			if(i%bolen==0) {
				System.out.print(i+ "-");
			}
		}

	}

}
