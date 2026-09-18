package Pakotne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class kartosana {

    public static void main(String[] args) {

        Scanner dati = new Scanner(System.in);
        ArrayList<Double> atzimes = nolasitd.nolasit_gala();

        System.out.println("1 - Kārtot augošā secībā\n"
                + "2 - Kārtot dilstošā secībā\n"
                + "3 - Atcelt");

        int ievade = dati.nextInt();
        switch (ievade) {

        case 1:
            Collections.sort(atzimes);
            System.out.println("Atzīmes augošā secībā:");
            
            for (double atzime : atzimes) {
                System.out.println(atzime);
            }
            break;

        case 2:
            Collections.sort(atzimes, Collections.reverseOrder());
            System.out.println("Atzīmes dilstošā secībā:");
            for (double atzime : atzimes) {
                System.out.println(atzime);
            }
            break;

        case 3:
            System.out.println("Darbība atcelta.");
            break;

        default:
            System.out.println("Tāda darbība neeksistē!");
            break;
        }

        dati.close();
    }
}