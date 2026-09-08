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
		
		String[] kriterijs = new String[kriterijisk];
		scan.nextLine(); 
		
		int i;
		String vards = null;
		do {
			for (i=0; i<kriterijisk; i++) {
			System.out.println((i+1) + ".kritērijs: ");
			kriterijs [i] = scan.nextLine();
			vards = kriterijs[i];
			if (!vards.equals(null) && vards.equals(" ")) {
				System.out.println("Kļūda! Nekorekti ievadīts kritērija nosaukums!");
			}
			}
		}while(!vards.equals(null) && vards.equals(""));
		
		int[] procenti = new int[kriterijisk];
		int summa;

		do {
		    summa = 0;
		    for (i = 0; i < kriterijisk; i++) {
		        System.out.println("Cik svarīgs ir " + kriterijs[i] + " kritērijs?");
		        procenti[i] = scan.nextInt();
		        summa += procenti[i];
		    }
		    if (summa > 100) {
		        System.out.println("Kritēriju kopējais svars nedrīkst pārsniegt 100%!");
		    }
		    if (summa != 100) {
		        System.out.println("Kritēriju kopējais svars jāsasniedz 100%!");
		    }
		} while (summa > 100 || summa != 100);
		
		scan.close();
	}

}
