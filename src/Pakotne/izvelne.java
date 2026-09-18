package Pakotne;

import java.util.Scanner;

public class izvelne {
	
	public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int izvele;

        do {
            System.out.println("1 - Ievadīt skolēnu atzīmes");
            System.out.println("2 - Apskatīt saglabātos rezultātus");
            System.out.println("3 - Kārtot gala vērtējumus");
            System.out.println("4 - Beigt darbu");

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