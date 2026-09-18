package Pakotne;

public class KriterijuSvarsUnNosaukumi {

	static String[] MetodeName(int kriterijisk) {
		String[] kriterijs = new String[kriterijisk];

		int i;
		String vards = null;
		do {
			for (i=0; i<kriterijisk; i++) {
			System.out.println((i+1) + ".kritērijs: ");
			kriterijs[i] = izvelne.scan.nextLine();
			vards = kriterijs[i];
				if (!vards.equals(null) && vards.equals(" ")) {
					System.out.println("Kļūda! Nekorekti ievadīts kritērija nosaukums!");
				}
			}
		}while(!vards.equals(null) && vards.equals(""));
		return kriterijs;
	}
	static int[] MetodeSvars(int kriterijisk, String[] kriterijs) {

	 // Kritēriju procentuālais svars
		int[] procenti = new int[kriterijisk];
		int summa;

		do {
		    summa = 0;
		    for (int i = 0; i < kriterijisk; i++) {
		        System.out.println("Cik svarīgs ir " + kriterijs[i] + " kritērijs?");
		        procenti[i] = izvelne.scan.nextInt();
		        summa += procenti[i];
		    }
		    if (summa > 100) {
		        System.out.println("Kritēriju kopējais svars nedrīkst pārsniegt 100%!");
		    }
		    if (summa != 100) {
		        System.out.println("Kritēriju kopējais svars jāsasniedz 100%!");
		    }
		} while (summa > 100 || summa != 100);
		return procenti;
	}
}

