package Pakotne;

import java.util.Scanner;

public class Kalkulators {

	public static void main(String[] args) {
		int skoleni, kriterijisk;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Ievadiet skolēnu skaitu: ");
			skoleni = scan.nextInt();
			if (skoleni ==0 || skoleni < 0) {
				System.out.println("Kļūda! Nekorekti ievadīts skolēnu skaits!");
			}
		} while (skoleni==0 || skoleni < 0);
		
		do {
			System.out.println("Cik daudz kritēriji?");
			kriterijisk = scan.nextInt();
			if (kriterijisk ==0 || kriterijisk < 0) {
				System.out.println("Kļūda! Nekorekti ievadīts kritēriju skaits!");
			}
		} while (kriterijisk==0 || kriterijisk < 0);
	}

}
