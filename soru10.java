package sorular;

import java.util.ArrayList;
import java.util.Scanner;

public class soru10 {

	public static void main(String[] args) {
		// kullan�c�dan al�nan 3 say�dan en b�y���n� bulma ve b�y�kten k����e s�ralama
		
		Scanner scan= new Scanner(System.in);
		int a,b,c;
		System.out.println("a say�s�n� giriniz: ");
		a=scan.nextInt();
		System.out.println("b say�s�n� giriniz:");
		b=scan.nextInt();	
		System.out.println("c say�s�n� giriniz: ");
		c=scan.nextInt();
		
		if(a>b&&a>c) {
			System.out.println("en b�y�k say�: "+a);
			if(b>c) {
				System.out.println("s�ralama:"+a+">"+b+">"+c);
			}else if(c>b) {
				System.out.println("s�ralama:"+a+">"+c+">"+b);
			}
		}else if(b>a&&b>c) {
			System.out.println("en b�y�k say�: "+b);
			if(a>c) {
				System.out.println("s�ralama:"+b+">"+a+">"+c );
			}else if(c>a) {
				System.out.println("s�ralama:"+b+">"+c+">"+a );
			}
		}else {
			System.out.println("en b�y�k say�: "+c);
			if(a>b) {
				System.out.println("s�ralama: "+c+">"+a+">"+b);
			}if(b>a) {
				System.out.println("s�ralama: "+c+">"+b+">"+a);
			}
		}
	}

}
