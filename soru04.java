package sorular;

import java.util.Scanner;

public class soru04 {

	public static void main(String[] args) {
		// kullan�c�dan al�nacak iki say� aral���ndaki kullan�c�n�n istedi�i say�ya b�l�nebilen say�lar� bulan program
		
		Scanner scan = new Scanner(System.in);
		int baslang�c,bitis,bolen;
		
		System.out.println("ba�lang�� say�s�n� giriniz: ");
		baslang�c=scan.nextInt();
		System.out.println("bitis say�s�n� giriniz: ");
		bitis=scan.nextInt();
		System.out.println("hangi say�ya b�l�ns�n: ");
		bolen=scan.nextInt();
		
		for(int i=baslang�c;i<bitis;i++) {
			if(i%bolen==0) {
				System.out.print(i+ "-");
			}
		}

	}

}
