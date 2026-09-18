package Pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtzimjuIevadeUnAprekinasana {

	static int[] Grade(int skoleni, int kriterijisk, String[] kriterijs){
		Scanner scan = new Scanner(System.in);
		int[] atzimes = new int[skoleni * kriterijisk];
	    for (int j = 0; j < skoleni; j++) {
            System.out.println();
            System.out.println((j + 1) + ". skolēns:");
            for (int i = 0; i < kriterijisk; i++) {
                int atzime;
                do {
                    System.out.println("Kādu atzīmi " + (j + 1) + ". skolēns dabūja kritērijā \"" + kriterijs[i] + "\"?");
                    atzime = scan.nextInt();
                    if (atzime < 0 && atzime > 10) {
                    	System.out.println("Nekorekti ievadīta atzīme!");
                    }
                } while (atzime < 0 && atzime > 10);
                atzimes[j * kriterijisk + i] = atzime;
            }
           
        }
		return atzimes;
	}
	
	static void FinGrade(int skoleni, int kriterijisk, int[] atzimes, int[] procenti) {
		  DecimalFormat df = new DecimalFormat("#.##");
	        for (int j = 0; j < skoleni; j++) {
	            double rezultats = 0;
	            for (int i = 0; i < kriterijisk; i++) {
	                rezultats += atzimes[j * kriterijisk + i] * procenti[i] / 100.00;
	            }
	            System.out.println((j + 1) + ". skolēna gala vērtējums: " +df.format(rezultats));
	        }
	}
	
}
