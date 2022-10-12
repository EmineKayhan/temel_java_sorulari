package sorular;

import java.util.ArrayList;
import java.util.Scanner;

public class soru10 {

	public static void main(String[] args) {
		// kullanýcýdan alýnan 3 sayýdan en büyüðünü bulma ve büyükten küçüðe sýralama
		
		Scanner scan= new Scanner(System.in);
		int a,b,c;
		System.out.println("a sayýsýný giriniz: ");
		a=scan.nextInt();
		System.out.println("b sayýsýný giriniz:");
		b=scan.nextInt();	
		System.out.println("c sayýsýný giriniz: ");
		c=scan.nextInt();
		
		if(a>b&&a>c) {
			System.out.println("en büyük sayý: "+a);
			if(b>c) {
				System.out.println("sýralama:"+a+">"+b+">"+c);
			}else if(c>b) {
				System.out.println("sýralama:"+a+">"+c+">"+b);
			}
		}else if(b>a&&b>c) {
			System.out.println("en büyük sayý: "+b);
			if(a>c) {
				System.out.println("sýralama:"+b+">"+a+">"+c );
			}else if(c>a) {
				System.out.println("sýralama:"+b+">"+c+">"+a );
			}
		}else {
			System.out.println("en büyük sayý: "+c);
			if(a>b) {
				System.out.println("sýralama: "+c+">"+a+">"+b);
			}if(b>a) {
				System.out.println("sýralama: "+c+">"+b+">"+a);
			}
		}
	}

}
