package sorular;

import java.util.Scanner;

public class soru00 {

	public static void main(String[] args) {
		// kullan�c�dan al�nan ifadeyi kullan�c�n�n istedi�i miktarda ekrana yazd�ran program
		Scanner scan = new Scanner(System.in);
		String metin;
		int miktar;
		
		System.out.println("bir metin giriniz: ");
		metin=scan.nextLine();
		System.out.println("yazd�rmak istedi�iniz miktar� giriniz: ");
		miktar=scan.nextInt();
		
		for(int i=0;i<miktar;i++) {
			System.out.println(metin);
		}
		

	}

}
