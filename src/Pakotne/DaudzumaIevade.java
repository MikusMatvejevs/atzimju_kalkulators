package Pakotne;

import java.util.Scanner;

public class DaudzumaIevade {

    static int SkIevade(String text) {

        int sk;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println(text);
            sk = scan.nextInt();

            if (sk <= 0) {
                System.out.println("Kļūda! Nekorekti ievadīts skaits!");
            }

        } while (sk <= 0);
        
        scan.close();
        return sk;
        
    }
}