package Pakotne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class nolasitd {

    static void nolasit() {

        try {
            File fails = new File("rezultati.txt");
            Scanner lasa = new Scanner(fails);

            while (lasa.hasNextLine()) {
                String rinda = lasa.nextLine();
                System.out.println(rinda);
            }

            lasa.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fails netika atrasts!");
        }
    }


    static ArrayList<Double> nolasit_gala() {
        ArrayList<Double> atzimes = new ArrayList<>();

        try {
            File fails = new File("rezultati.txt");
            Scanner lasa = new Scanner(fails);

            while (lasa.hasNextLine()) {

                String rinda = lasa.nextLine();
                if (rinda.startsWith("Gala vērtējums:")) {

                    String vertiba = rinda.replace("Gala vērtējums:", "").trim();

                    vertiba = vertiba.replace(",", ".");
                    double atzime = Double.parseDouble(vertiba);
                    atzimes.add(atzime);
                }
            }

            lasa.close();

        } catch (FileNotFoundException e) {
            System.out.println("Fails netika atrasts!");
        }

        return atzimes;
    }
}