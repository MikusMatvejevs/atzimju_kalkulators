package Pakotne;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kalkulators {
	
	public static void main(String[] args) {
		int skoleni, kriterijisk;
		Scanner scan = new Scanner(System.in);
		
		
		
		
		 // Kritēriju un skolēnu skaita ievade
		kriterijisk = DaudzumaIevade.SkIevade("Cik daudz kritēriji?");
		skoleni = DaudzumaIevade.SkIevade("Cik daudz skolēni?");
		
		
		// Kritēriju nosaukumi
		//String[] kriterijs = new String[kriterijisk];
		//scan.nextLine(); 
		
	String[] kriterijs = KriterijuSvarsUnNosaukumi.MetodeName(kriterijisk);
	int[] procenti = KriterijuSvarsUnNosaukumi.MetodeSvars(kriterijisk, kriterijs);
		
		
		
        int[] atzimes = new int[skoleni * kriterijisk];
        
        // Atzīmju ievade
        for (int j = 0; j < skoleni; j++) {
            System.out.println();
            System.out.println((j + 1) + ". skolēns:");
            for (int i = 0; i < kriterijisk; i++) {
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
        for (int j = 0; j < skoleni; j++) {
            double rezultats = 0;
            for (int i = 0; i < kriterijisk; i++) {
                rezultats += atzimes[j * kriterijisk + i] * procenti[i] / 100.00;
            }
            System.out.println((j + 1) + ". skolēna gala vērtējums: " +df.format(rezultats));
        }
        scan.close();
        
        Scanner dati = new Scanner(System.in);
	char izv;
		
		do {
			System.out.println("\n1 - Ievadīt skolēnu un kritēriju skaitu"
							 + "\n2 - Nolasīt iepriekšējos datus"
							 + "\n3 - Ieglabāt pašreizējos datus"
							 + "\n4 - Datu kārtošana"
							 + "\n5 - Gala vērtējums"
							 + "\nx - Beigt");
			izv = dati.next().charAt(0);
			izv = Character.toLowerCase(izv);
			
		switch(izv) {	
		
		
		case 'x':
			break;
		default: System.out.println("Neeksistē!"); break;
		}
        }while(izv != 'x');
	}

}
