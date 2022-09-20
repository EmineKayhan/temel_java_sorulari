package sorular;

import java.util.Scanner;

public class soru08 {

	public static void main(String[] args) {
		// girilen metinde kaç tane sesli harf olduðunu bulan program
		
		Scanner scan = new Scanner(System.in);
		String metin;
		System.out.println("bir metin giriniz:");
		metin=scan.nextLine();
	
		String sesli= "e,a,u,ü,ý,i,ö,o";
		int i,sayýS;
		sayýS=0;
		for(i=0;i<metin.length();i++) {
			for(int j=0;j<sesli.length();j++) {
				if(metin.charAt(i)==sesli.charAt(j)) {
					sayýS++;
			}
			
			}
		}
		System.out.println("metindeki sesli harf sayýsý:"+sayýS);
	}

}
