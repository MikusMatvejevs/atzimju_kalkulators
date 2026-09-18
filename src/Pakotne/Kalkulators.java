package Pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kalkulators {

	static void aprekinat() {
		int skoleni, kriterijisk;
		Scanner scan = new Scanner(System.in);
		
		 // Skolēnu skaita ievade
		do {
			System.out.println("Ievadiet skolēnu skaitu: ");
			skoleni = scan.nextInt();
			if ( skoleni <= 0) {
				System.out.println("Kļūda! Nekorekti ievadīts skolēnu skaits!");
			}
		} while (skoleni <= 0);
		
		 // Kritēriju skaita ievade
		do {
			System.out.println("Cik daudz kritēriji?");
			kriterijisk = scan.nextInt();
			if (kriterijisk <= 0) {
				System.out.println("Kļūda! Nekorekti ievadīts kritēriju skaits!");
			}
		} while (kriterijisk <= 0);
		
		// Kritēriju nosaukumi
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
		
		 // Kritēriju procentuālais svars
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
		
        int[] atzimes = new int[skoleni * kriterijisk];
        
        // Atzīmju ievade
        for (int j = 0; j < skoleni; j++) {
            System.out.println();
            System.out.println((j + 1) + ". skolēns:");
            for (i = 0; i < kriterijisk; i++) {
                int atzime;
                do {
                    System.out.println("Kādu atzīmi " + (j + 1) + ". skolēns dabūja kritērijā \"" + kriterijs[i] + "\"?");
                    atzime = scan.nextInt();
                    if (atzime < 0) {
                    	System.out.println("Nekorekti ievadīta atzīme!");
                    }
                } while (atzime < 0);
                atzimes[j * kriterijisk + i] = atzime;
            }
        }
		
     // Gala vērtējuma aprēķins
        DecimalFormat df = new DecimalFormat("#.##");
        double[] rezultati = new double[skoleni];

        for (int j = 0; j < skoleni; j++) {
            double rezultats = 0;

            for (i = 0; i < kriterijisk; i++) {
                rezultats += atzimes[j * kriterijisk + i] * procenti[i] / 100.00;
            }

            rezultati[j] = rezultats;

            System.out.println((j + 1)
                    + ". skolēna gala vērtējums: "
                    + df.format(rezultats));
        }

        datne.ieglabat(skoleni,kriterijisk,kriterijs,procenti,atzimes,rezultati);
	}

}
