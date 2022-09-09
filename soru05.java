package sorular;

import java.util.Scanner;

public class soru05 {

	public static void main(String[] args) {
		// kullanýcýdan alýnan vize ve final notlarýnýn harf karþýlýðýný yazan program
		
		int v,f;
		float ort;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("vize notunuzu giriniz: ");
		v=scan.nextInt();
		System.out.println("final notunuzu giriniz: ");
		f=scan.nextInt();
		
		ort=(float)(v*0.4+f*0.6);
		
		System.out.println("ortalamanýz: "+ort);
		
		if(ort>=90&&ort<=100) {
			System.out.println("AA");
		}else if(ort>=85&&ort<90){
			System.out.println("BA");
		}else if(ort>=75&&ort<85) {
			System.out.println("BB");
		}else if(ort>=70&&ort<75) {
			System.out.println("CB");
		}else if(ort>=60&&ort<70) {
			System.out.println("CC");
		}else if(ort>=50&&ort<60) {
			System.out.println("DC");
		}else if(ort>=40&&ort<50) {
			System.out.println("DD");
		}else if(ort>=30&&ort<40) {
			System.out.println("FD");
		}else {
			System.out.println("FF");
		}

	}

}
