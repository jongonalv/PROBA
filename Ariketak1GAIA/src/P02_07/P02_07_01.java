package P02_07;

import java.util.Scanner;

public class P02_07_01 {

	public static void main(String[] args) {
		
//		Scanner paketea erabiliz, scanner bat sortu
		
		Scanner sc = new Scanner(System.in);
		
//		erabiltzaileari zenbakia eskatu, konprobaketa aldagaia eta kontagailua definitu
			
		System.out.println("Zenbaki bat sartu");
		int bider = sc.nextInt();
		int konprobatu;
		int i;
		
//		Sartutako zenbakia 10 baino handiagoa bada, ez da biderkadura taula egingo
		
		if (bider <= 10) {
		
			do {
				
				System.out.println("Ziurtatu zenbaki berdina dela:");
				konprobatu = sc.nextInt();
				
			} while (bider != konprobatu);	
			
		} else {
			
			System.out.println("Sartutako zenbakia 10 baino handiagoa da. Konprobaketa ez da egingo");
			System.out.println();
			
		}
		
//		biderkadura taula 10ekoa denez, kontagailua 10 arte.
		
			for (i = 1; i <= 10; i++) {
				System.out.println(bider + " x " + i + " = " + (bider * i));
			}
	}
}
