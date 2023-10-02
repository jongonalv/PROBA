package P01_09;

public class P01_09 {

	public static void main(String[] args) {
		
//		Celsius graduak aldagaiak
		
		int C1 = 0;
		int C2 = 15;
		int C3 = 20;
		
//		Fahrenheit graduak aldagaiak
		
		int F1 = 0 ;
		int F2 = 40;
		int F3 = 70;
		
//		C = (F-32)/1.8 formula aplikatuz C graduak atera
		
		double EmaitzaC1 = (F1-32)/1.8;
		double EmaitzaC2 = (F2-32)/1.8;
		double EmaitzaC3 = (F3-32)/1.8;
		
//		F = 1.8*C+32 formula aplikatuz F graduak atera
		
		double EmaitzaF1 = 1.8*C1+32;
		double EmaitzaF2 = 1.8*C2+32;
		double EmaitzaF3 = 1.8*C3+32;
		
//		Emaitzak azaldu
		
		System.out.println(EmaitzaC1 + " Celsius gradu dira " + F1 + " Fahrenheit");
		System.out.println(EmaitzaC2 + " Celsius gradu dira " + F2 + " Fahrenheit");
		System.out.println(EmaitzaC3 + " Celsius gradu dira " + F3 + " Fahrenheit");
		
		System.out.println(EmaitzaF1 + " Farenheit gradu dira " + C1 + " Celsius");
		System.out.println(EmaitzaF2 + " Farenheit gradu dira " + C2 + " Celsius");
		System.out.println(EmaitzaF3 + " Farenheit gradu dira " + C3 + " Celsius");

	}

}
