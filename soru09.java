package sorular;

import java.util.ArrayList;
import java.util.Scanner;

public class soru09 {

	public static void main(String[] args) {
		// girilen say�y� rakam rakam ay�ran program
		Scanner scan= new Scanner(System.in);
		String sayi;
		int i=0;
		System.out.println("bir say� giriniz: ");
		sayi=scan.next();
		
		ArrayList<Integer>dizi=new ArrayList<>();
		for(i=0;i<sayi.length();i++) {
			dizi.add(Integer.parseInt(Character.toString(sayi(i))));
		}
		
		System.out.println(dizi);

	}

}
