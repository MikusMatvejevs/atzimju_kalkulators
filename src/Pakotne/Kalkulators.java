package Pakotne;

public class Kalkulators {

    static void aprekinat() {

        int kriterijisk = 0;
        int skoleni = 0;

        String[] kriterijs = null;
        int[] procenti = null;
        int[] atzimes = null;
        double[] rezultati = null;

        int izvele;

        do {
            System.out.println("1 - Ievadīt kritērijus un svaru");
            System.out.println("2 - Ievadīt skolēnu skaitu");
            System.out.println("3 - Ievadīt skolēnu atzīmes");
            System.out.println("4 - Aprēķināt gala vērtējumus");
            System.out.println("5 - Atpakaļ");

            izvele = izvelne.scan.nextInt();

            switch (izvele) {

            case 1:
                kriterijisk = DaudzumaIevade.SkIevade("Cik daudz kritēriji?");
                kriterijs =KriterijuSvarsUnNosaukumi.MetodeName(kriterijisk);
                procenti = KriterijuSvarsUnNosaukumi.MetodeSvars(kriterijisk, kriterijs);
                System.out.println("Kritēriji saglabāti!");
                break;

            case 2:
                skoleni = DaudzumaIevade.SkIevade("Cik daudz skolēni?");
                System.out.println("Skolēnu skaits saglabāts!");
                break;

            case 3:
                if (kriterijs == null) {
                	System.out.println("Vispirms ievadi kritērijus!");
                }
                else if (skoleni == 0) {
                    System.out.println("Vispirms ievadi skolēnu skaitu!");
                }
                else {
                    atzimes = AtzimjuIevadeUnAprekinasana.Grade(skoleni,kriterijisk,kriterijs);
                    System.out.println("Atzīmes saglabātas!");
                }
                break;

            case 4:
                if (kriterijs == null || procenti == null) {
                    System.out.println("Vispirms ievadi kritērijus!");
                }
                else if (skoleni == 0) {
                	System.out.println("Vispirms ievadi skolēnu skaitu!");
                }
                else if (atzimes == null) {
                    System.out.println("Vispirms ievadi skolēnu atzīmes!");
                }
                else {
                    rezultati = AtzimjuIevadeUnAprekinasana.FinGrade(skoleni,kriterijisk,atzimes,procenti);

                    datne.ieglabat(
                            skoleni,
                            kriterijisk,
                            kriterijs,
                            procenti,
                            atzimes,
                            rezultati);

                    System.out.println("Rezultāti saglabāti failā!");
                }
                break;

            case 5:
                break;

            default:
                System.out.println("Tāda darbība neeksistē!");
                break;
            }

        } while (izvele != 5);
    }
}