package P02_07;

public class P02_07_02 {

	public static void main(String[] args) {
		
		int kont, kont2;
		int emaitza;
		
		for (kont = 1; kont <= 10; kont++) {
			System.out.println("******** "+  kont + " BIDERKATURA TAULA *********");
			for (kont2 = 1; kont2 <= 10; kont2++) {
					System.out.println(kont + "x" + kont2 + " = " + (emaitza = kont * kont2));
			}
		}

	}

}
