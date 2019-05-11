
public class Dekoration {

	public static void main(String[] args) {

		aufgabeC();
	}

	public static void aufgabeA() {
		Interaktionsbrett ib = new Interaktionsbrett();

		int x = 10;
		for (int i = 0; i < 7; ++i) {
			x = 10;
			for (int j = i; j > 0; j--) {
				x+= 10;
				ib.neuesRechteck(x, 10*i, 10, 10);
			}
		}
	}
	public static void aufgabeB() {
		Interaktionsbrett ib = new Interaktionsbrett();
		int y = 100;
		int h = 0;
		int l = 0;
		for(int i = 1; i <8; ++i) {
			h+=10;
			l+=6;
			for(int j = i; j < 8;j++) {
				ib.neuesRechteck(13*j-l, y-h, 13, 10);
				
			}
		}		
	}
	public static void aufgabeC() {
		Interaktionsbrett ib = new Interaktionsbrett();
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 0){
				ib.neuesRechteck(14, 10*i, 7, 10);
				for(int j = 1; j < 10; j++) {
					ib.neuesRechteck(14*j+7, 10*i, 14, 10);
				}
			}else {
				for(int j = 1; j < 10; j++) {
					ib.neuesRechteck(14*j, 10*i, 14, 10);
				}
				ib.neuesRechteck(14*10, 10*i, 7, 10);
			}
			
		}
	}
}


//for(int i = 0; i < 6; i++) {
//	ib.neuesRechteck(13*i+6, y-10, 13, 10);
//}
//for(int i = 0; i < 5; i++) {
//	ib.neuesRechteck(13*i+12, y-20, 13, 10);
//}
//for(int i = 0; i < 4; i++) {
//	ib.neuesRechteck(13*i+18, y-30, 13, 10);
//}
//
//for(int i = 0; i < 3; i++) {
//	ib.neuesRechteck(13*i+24, y-40, 13, 10);
//}
//
//for(int i = 0; i < 2; i++) {
//	ib.neuesRechteck(13*i+30, y-50, 13, 10);
//}
//
//for(int i = 0; i < 1; i++) {
//	ib.neuesRechteck(13*i+36, y-60, 13, 10);
//}
