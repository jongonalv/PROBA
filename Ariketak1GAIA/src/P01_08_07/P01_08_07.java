package P01_08_07;

public class P01_08_07 {

	public static void main(String[] args) {
		
//		Aldagaiak definitzen ditugu
//		diru kantitatea
	
		int zenbatekoa	= 511;
		
//		Kalkuloak egiteko, beti berdin izango da, gure kantitatea zati billetearen kantitatea, 
//		eta moduloa erabiliz, zatiketaren sobera gordeko dugu hurrengo billeteko kalkuloak egiteko
		
//		Bostehun billeteko kalkuloa
		
		int bostehun 	= zenbatekoa / 500;
		int soberan		= zenbatekoa % 500;
		
		
//		berrehun billeteko kalkuloa
		
		int berrehun 	= soberan / 200;
			soberan		= soberan % 200;
		
//		ehun billeteko kalkuloa
		
		int ehun 		= soberan / 100;
			soberan		= soberan % 200;
		
//		hogei billeteko kalkuloa
		
		int hogei		= soberan / 20;
			soberan		= soberan % 20;
		
//		hamar billeteko kalkuloa
		
		int hamar		= soberan / 10;
		
//		diru soberan kalkuloa
		
		soberan		= soberan % 10;
		
		
		System.out.println(bostehun 	+ " 500ko billete daude");
		System.out.println(berrehun 	+ " 200ko billete daude");
		System.out.println(ehun			+ " 100ko billete daude");
		System.out.println(hogei 		+ " 20ko billete daude");
		System.out.println(hamar 		+ " 10eko billete daude");
		System.out.println(soberan 		+ " euro geratu dira soberan");
		
		System.out.println(zenbatekoa);

	}
}

