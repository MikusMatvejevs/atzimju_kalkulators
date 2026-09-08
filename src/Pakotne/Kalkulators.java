package Pakotne;

import java.util.Scanner;

import java.util.Scanner;

public class Kalkulators {

	public static void main(String[] args) {
		int skoleni;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Ievadiet skolēnu skaitu: ");
			skoleni = scan.nextInt();
			if (skoleni ==0 || skoleni < 0) {
				System.out.println("Kļūda! Nekorekti ievadīts skolēnu skaits!");
			}
		} while (skoleni==0 || skoleni < 0);
		
	}

}
