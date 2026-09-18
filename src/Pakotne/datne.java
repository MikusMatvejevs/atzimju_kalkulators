package Pakotne;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class datne {

    static void ieglabat(int skoleni, int kriterijisk, String[] kriterijs,
            int[] procenti, int[] atzimes, double[] rezultati) {

        DecimalFormat df = new DecimalFormat("#.##");

        try {
            FileWriter writer = new FileWriter("rezultati.txt");

            for (int j = 0; j < skoleni; j++) {
                writer.write((j + 1) + ". skolēns:\n");

                for (int i = 0; i < kriterijisk; i++) {
                    writer.write(kriterijs[i] + ": "
                        + atzimes[j * kriterijisk + i]
                        + " (" + procenti[i] + "%)\n");
                }

                writer.write("Gala vērtējums: " + df.format(rezultati[j]) + "\n");
                writer.write("\n");
            }

            writer.close();

            System.out.println("Rezultāti saglabāti failā rezultati.txt!");

        } catch (IOException e) {
            System.out.println("Kļūda, saglabājot rezultātus failā!");
            e.printStackTrace();
        }
    }
}