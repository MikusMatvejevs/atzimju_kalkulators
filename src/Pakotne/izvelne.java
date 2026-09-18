package Pakotne;

import java.util.Scanner;

public class izvelne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int izvele;

        do {
            System.out.println("\n1 - Ievadīt skolēnu atzīmes"
                    + "\n2 - Apskatīt saglabātos rezultātus"
                    + "\n3 - Kārtot gala vērtējumus"
                    + "\n4 - Beigt darbu");

            izvele = scan.nextInt();

            switch (izvele) {

            case 1:
                Kalkulators.aprekinat();
                break;

            case 2:
                nolasitd.nolasit();
                break;

            case 3:
                kartosana.kartot();
                break;

            case 4:
                System.out.println("Programma apturēta!");
                break;

            default:
                System.out.println("Tāda darbība neeksistē!");
                break;
            }

        } while (izvele != 4);

        scan.close();
    }
}