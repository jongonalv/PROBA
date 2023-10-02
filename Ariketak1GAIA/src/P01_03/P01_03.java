package P01_03;

//		Demagun adina, ikasketen_maila eta diru-sarrera aldagai osoak ditugula, eta emaitza aldagai boolearrean honako balio hau biltegiratu:
//
//		Egia da, adina 28koa edo txikiagoa bada, ikasketa-maila hiru baino handiagoa dela eta diru-sarrerak 28.000 eurotik gorakoak direla.
//		Faltsua, bestela.

public class P01_03 {

	public static void main(String[] args) {
		
//		Aldagaiak definitzen ditugu, balioa emanda
		
		int adina = 33;
		int maila = 5;
		int diru_sarrera = 123132;
		
//		If erabiliz, konparaziok egiten ditugu, ea handiagoa edo txikiagoa den aldagai bakoitzarekiko
//		Barrun, boolean aldagai bat definituko dugu, konparazioaren arabera "true" edo "false" izanik
		
		if ((adina < 28) && (maila > 3) && (diru_sarrera > 28000)) {
			boolean emaitza = true;
			System.out.println(emaitza);
		} else {
			boolean emaitza = false;
			System.out.println(emaitza);
		}
	}
}