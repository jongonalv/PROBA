package P01_08_02;

import java.util.Scanner;

public class P01_08_02 {
		
		public static void main(String[] args) {

			
//			radioa, dezimaletan ateratzeko, float aldagai gisa definitzen dugu
//			decimal asko atera daitezke pi zenbakian, beraz, double aldagai gisa definitzen dugu azalera
			
			double radio = 5.2;
			double azalera = Math.PI * Math.pow(radio, 2);
			System.out.println("Zirkuferentziaren azalera: " + azalera + " zentimetro");

		}
	}