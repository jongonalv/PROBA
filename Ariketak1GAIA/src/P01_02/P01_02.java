package P01_02;

import java.util.Scanner;

//a eta b bi aldagai emanda, a eta b-ren balioak trukatuko dituen Javan eginiko 
//programa bat egin ezazu. Hasiera batean, a-ri 5 eta b-ri 8 balioa emango zaizkie.

public class P01_02 {

	public static void main(String[] args) {
		
//		Aldagaiak definitzen ditugu, balioa emanda

		int a = 5;
		int b = 8;
	
//		beste aldagai bat sortuko dugu, a-ren jatorrizko balioa gordetzeko
	
		int c = a;
		
//		a-ren balioa trukatzen dugu b balioan, eta c balioa, a jatorrizko gisa, b-n gorde
	
		a = b;
		b = c;
	
		System.out.println(a + " a balioa trukatua");
		System.out.println(b + " b balioa trukatua");
		
	}
}