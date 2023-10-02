package P01_08_06;

public class P01_08_06 {

	public static void main(String[] args) {
		
//		Karaktere aleatorio bat sortzen dugu
	
		char Bokala = (char) (Math.random()*26 + 'a');
		System.out.println(Bokala);
		
//		Konprobatzen dugu ea bokala den, bokalez bokal
		
		if (Bokala == 'a' || Bokala == 'e' || Bokala == 'i' 
		 || Bokala == 'o' || Bokala == 'u') {
			
			System.out.println("Bokala da");
		} else {
			System.out.println("Konsonantea da");
		}
		
	}
}