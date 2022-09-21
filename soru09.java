package sorular;

import java.util.ArrayList;
import java.util.Scanner;

public class soru09 {

	public static void main(String[] args) {
		// girilen sayýyý rakam rakam ayýran program
		Scanner scan= new Scanner(System.in);
		String sayi;
		int i=0;
		System.out.println("bir sayý giriniz: ");
		sayi=scan.next();
		
		ArrayList<Integer>dizi=new ArrayList<>();
		for(i=0;i<sayi.length();i++) {
			dizi.add(Integer.parseInt(Character.toString(sayi(i))));
		}
		
		System.out.println(dizi);

	}

}
