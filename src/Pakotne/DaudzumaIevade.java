package Pakotne;

import java.util.Scanner;

public class DaudzumaIevade {

	static int SkIevade(String text) {
		int sk;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println(text);
			sk = scan.nextInt();
			if (sk <= 0) {
				System.out.println("Kļūda! Nekorekti ievadīts skaits!");
			}
		} while (sk <= 0);
		
		return sk;
	}
	
	public static void main(String[] args) {//main
		
		int skoleni, kriterijisk;
	do {
		kriterijisk = SkIevade("Cik daudz kritēriji?");
		skoleni = SkIevade("Cik daudz skolēni?");
		} while (kriterijisk <= 0 && skoleni <= 0);
}//main END
}//Class END
