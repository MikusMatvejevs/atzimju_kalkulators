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
        
        atzimes = AtzimjuIevadeUnAprekinasana.Grade(skoleni, kriterijisk, kriterijs);
		
        // Gala vērtējuma aprēķins
        AtzimjuIevadeUnAprekinasana.FinGrade(skoleni, kriterijisk, atzimes, procenti);
        scan.close();
        

	}

}
