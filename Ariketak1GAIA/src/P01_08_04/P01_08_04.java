package P01_08_04;

public class P01_08_04 {

	public static void main(String[] args) {
		
//		Aldagaiak definitzen ditugu, balioa emanda
		
		int adina = 33;
		int maila = 5;
		int diru_sarrera = 123132;
		
//		If erabiliz, konparaziok egiten ditugu, ea handiagoa edo txikiagoa den aldagai bakoitzarekiko
//		Barrun, boolean aldagai bat definituko dugu, konparazioaren arabera "true" edo "false" izanik
		
		if ((adina <= 28) && (maila > 3) || (adina < 30 && diru_sarrera > 30000)) {
			boolean emaitza = true;
			System.out.println(emaitza);
		} else {
			boolean emaitza = false;
			System.out.println(emaitza);
		}
	}
}
