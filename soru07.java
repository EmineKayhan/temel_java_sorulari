package sorular;

import java.util.Scanner;

public class soru07 {

	public static void main(String[] args) {
		// diskriminant ��z�m�
		int a,b,c;
		float delta,x1,x2;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("a say�s�n� giriniz: ");
		a=scan.nextInt();
		System.out.println("b say�s�n� giriniz: ");
		b=scan.nextInt();
		System.out.println("c say�s�n� giriniz: ");
		c=scan.nextInt();
		
		//delta bulaca��z
		delta= b^2-4*a*c;
		System.out.println("delta: "+delta);
		
		if(delta>0) {
			System.out.println("sistemin iki k�k� vard�r:");
			x1=(float) (-b-Math.sqrt(delta)/2*a); System.out.println("1. k�k:"+x1);
			x2=(float) (-b+Math.sqrt(delta)/2*a); System.out.println("2. k�k: "+x2);
		}else if(delta==0) {
			System.out.println("�ak���k k�k vard�r.");
			x1=(float)((-b)/2*a); System.out.println("k�k:"+x1);
		}else System.out.println("sistemin k�k� yoktur.");
		
	}

}
