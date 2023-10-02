package P01_08_05;

public class P01_08_05 {

	public static void main(String[] args) {

//		Aldagaiak definitzen ditugu
		
		int	t 				= 12345;			
		int orduak 			= t / 3600;			// orduak ateratzeko 3600 zatitzen dugu gure zenbakia
		int minutuak 	   	= (t % 3600) / 60;	// gure lehen zatiketaren ondarra, gure minutuak izango dira. Minutuetara pasatzeko berriz, /60 egiten dugu
		int segundoak     	= t % 60;			// azkenik, aurreko zatiketaren ondarra falta zaizkigun segundoak izango dira, beraz, ondarrakin nahiko
		
		System.out.println(orduak + " ordu, " + minutuak + " minutu eta " + segundoak + " segundu dira " 
		+ t + " zenbakia segunduk badira suposatuz");

	}
}
