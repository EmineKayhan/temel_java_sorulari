package sorular;

import java.util.ArrayList;
import java.util.Scanner;

public class soru01 {

	public static void main(String[] args) {
		// kullan�c�n�n girdi�i say�lardan en b�y�k olan� bulup ekrana yazd�ran program
		
		Scanner scan = new Scanner(System.in);
		int sayi=0;
	    ArrayList<Integer> sayilar= new ArrayList<Integer>();
	    while(sayi!=-1) {
	    	System.out.println("bir say� giriniz. e�er ��kmak istiyorsan�z -1 tu�lay�n�z!");
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

		System.out.println("En B�y�k Say�: "+ buyuk);

	}

}
