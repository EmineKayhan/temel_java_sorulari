package sorular;

import java.util.ArrayList;
import java.util.Scanner;

public class soru01 {

	public static void main(String[] args) {
		// kullanýcýnýn girdiði sayýlardan en büyük olaný bulup ekrana yazdýran program
		
		Scanner scan = new Scanner(System.in);
		int sayi=0;
	    ArrayList<Integer> sayilar= new ArrayList<Integer>();
	    while(sayi!=-1) {
	    	System.out.println("bir sayý giriniz. eðer çýkmak istiyorsanýz -1 tuþlayýnýz!");
	    	sayi=scan.nextInt();
	    	sayilar.add(sayi);
	    }
		System.out.println(sayilar);
		
		int buyuk=sayilar.get(0);
		for(int i=0;i<sayilar.size();i++) {
			if(sayilar.get(i)>buyuk) {
				buyuk=sayilar.get(i);
			} 
		}

		System.out.println("En Büyük Sayý: "+ buyuk);

	}

}
