package Pakotne;

public class DaudzumaIevade {

    static int SkIevade(String text) {

        int sk;

        do {
            System.out.println(text);
            sk = izvelne.scan.nextInt();

            if (sk <= 0) {
                System.out.println("Kļūda! Nekorekti ievadīts skaits!");
            }

        } while (sk <= 0);
        
        return sk;
        
    }
}