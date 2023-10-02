package P01_10;

public class P01_10 {

	public static void main(String[] args) {

//		A eragiketa
		
		boolean Emaitza1 = ((4-2) * (5+1)/2) > 2 - (4+3);
		System.out.println(Emaitza1);
		
//		((2) * (3)) > 2 - 1 = 6 > 1 = TRUE
		
//		B eragiketa
		
		boolean Emaitza2 = (6+3) > 8 && (6-1) * 2 < 8 || 2*3 ==8;
		System.out.println(Emaitza2);
		
//		(9) > 8 && (5) * 2 < 8 || 6 == 8
//		TRUE && FALSE || FALSE = FALSE
		
//		C eragiketa
		
		int X = 7;
		int Z = 2;
		
		boolean Emaitza3 = (1.0 < X) && (X < Z + 7.0);
		System.out.println(Emaitza3);
		
//		(TRUE) && (7 < 9) = TRUE && TRUE = TRUE
		
//		D eragiketa
		
		int X2 	= 1;
		int Y	= 4;
		int Z2	= 10;
		double PI	= 3.14;
		
		boolean Emaitza4 = PI * X2 * X2 > Y || 2 * PI * X2 <= Z2;
		System.out.println(Emaitza4);
		
//		3.14 * 1 * 1 > 4 || 2 * 3.14 * 1 <= 10;
//		FALSE			 || TRUE				= TRUE
		
		int X3 	= 1;
		int Y2	= 4;
		int Z3	= 10;
		
//		E eragiketa
		
		boolean Emaitza5 = X3 >3 && Y2==4 || X3 + Y2 <=Z3;
		System.out.println(Emaitza5);
		
//		1 > 3 && 4==4 || 1 + 4 <= 10
//		FALSE && TRUE || TRUE
//		FALSE		  || TRUE				= TRUE
		
//		F eragiketa
		
		boolean Emaitza6 = X3 >3 && (Y2==4 || X3 + Y2 <=Z3);
		System.out.println(Emaitza6);
		
//		1 > 3 && (4==4 || 1 + 4 <=10
//		1 > 3 && (TRUE || TRUE)
//		1 > 3 && FALSE
//		FALSE && FALSE = FALSE
		
//		G eragiketa
		
		int X4	= 1;
		int Y3	= 4;
		int Z4	= 10;
		int PI2	= 6;
		int E	= 3;
		
		boolean Emaitza7 = (!(2 * X4 == Y3/2 || (PI2 - E) * Z4 > Y3)) == (!( Y3/2 == 2*X4) && (!(Y3 < (PI2-E) * Z4 )));
		System.out.println(Emaitza7);
		
//		(!(2 * 1 == 4/2 || (6 - 3) * 10 > 4)) == (!( 4/2 == 2*1) && (!(4 < (6-3) * 10 )))
//		(!(2 * 1 == 4/2 || 3 * 10 > 4)) == (!(2 == 2) && (!(4 < 3 * 10 )))
//		(!(2 == 2 || 30 > 4)) == (!(2 == 2) && (!(4 < 30 )))
//		(!(TRUE || TRUE)) == (!(TRUE) && (!(TRUE )))
//		(!(TRUE || TRUE)) == (FALSE && FALSE))
//		(!(TRUE)) == FALSE)
//		FALSE == FALSE = TRUE
		


	}

}
