package P01_07;

public class P01_07 {

	public static void main(String[] args) {
		
		int num = 5;				// 5 aldagaia definitu
		num += num - 1 * 4 + 1;		// 5 + (5 - 1 * + 1) = 5 + (5 - 4 + 1) = 7 erakutsiko du
		System.out.println(num);	// 2 azalduko da
		num = 4;					// 4 esleitu aldagaiari
		num %= 7 * num % 3 *7;		// 
		System.out.println(num);	// 4 % (7 * 4 % 3 * 7) = 4 % (28 % 21) = 4 % 7 = 4 erakutsiko du

	}

}
