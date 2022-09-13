package sorular;

import java.util.Scanner;

public class soru07 {

	public static void main(String[] args) {
		// diskriminant çözümü
		int a,b,c;
		float delta,x1,x2;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("a sayýsýný giriniz: ");
		a=scan.nextInt();
		System.out.println("b sayýsýný giriniz: ");
		b=scan.nextInt();
		System.out.println("c sayýsýný giriniz: ");
		c=scan.nextInt();
		
		//delta bulacaðýz
		delta= b^2-4*a*c;
		System.out.println("delta: "+delta);
		
		if(delta>0) {
			System.out.println("sistemin iki kökü vardýr:");
			x1=(float) (-b-Math.sqrt(delta)/2*a); System.out.println("1. kök:"+x1);
			x2=(float) (-b+Math.sqrt(delta)/2*a); System.out.println("2. kök: "+x2);
		}else if(delta==0) {
			System.out.println("çakýþýk kök vardýr.");
			x1=(float)((-b)/2*a); System.out.println("kök:"+x1);
		}else System.out.println("sistemin kökü yoktur.");
		
	}

}
