
package P01_01;
		
		class P01_01 {
			
//			0 eta 26 arteko zenbaki bat sortuko du aleatorioki, 
//			karakterea bihurtuz, 2 bada "b" karakterea sortuko du.

			public static char getLetrak() {
			return (char)(Math.random()*26 + 'a');				
			}
		
//			"getLetrak" erabiliko du print aginduak, 
//			karaktere aleatorio bat inprimatzeko agindu bakoitzarekiko.

			public static void main(String[] args) {
			System.out.println(getLetrak());
			System.out.println(getLetrak());
			System.out.println(getLetrak());
			System.out.println(getLetrak());

			                int a = 'a'; //a karakterearen posizioa
			                
			System.out.println(a);  // 'a' karakterearen Unicode balioa erakutsi
			
//			Hemen, double erabiliz, hau da, dezimalak erabili ditzakeen datu mota (64 tartekoa), 
//			pi aldagaia definituko dugu 3.14 balioarekin eta print aginduarekin programan ageriko da.
			
			double pi = 3.14;
			System.out.println(pi);
			
//			200 jartzerakoan, beti, -56 azalduko zaigu. 
//			Bitarreko posizioa azaltzen du, 199 jartzen bada, -57 jarriko du, 2001 -55
			
			byte ap = (byte) 200;    // -128tik 127rako tartea
			System.out.println(ap);

			}
			}

