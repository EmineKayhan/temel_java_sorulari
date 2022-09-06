package sorular;

import java.util.Scanner;

public class soru00 {

	public static void main(String[] args) {
		// kullanýcýdan alýnan ifadeyi kullanýcýnýn istediði miktarda ekrana yazdýran program
		Scanner scan = new Scanner(System.in);
		String metin;
		int miktar;
		
		System.out.println("bir metin giriniz: ");
		metin=scan.nextLine();
		System.out.println("yazdýrmak istediðiniz miktarý giriniz: ");
		miktar=scan.nextInt();
		
		for(int i=0;i<miktar;i++) {
			System.out.println(metin);
		}
		

	}

}
