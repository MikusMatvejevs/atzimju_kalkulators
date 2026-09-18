package Pakotne;

public class Kalkulators {

    static void aprekinat() {

        int kriterijisk =
                DaudzumaIevade.SkIevade("Cik daudz kritēriji?");

        int skoleni =
                DaudzumaIevade.SkIevade("Cik daudz skolēni?");

        String[] kriterijs =
                KriterijuSvarsUnNosaukumi.MetodeName(kriterijisk);

        int[] procenti =
                KriterijuSvarsUnNosaukumi.MetodeSvars(
                        kriterijisk, kriterijs);

        int[] atzimes =
                AtzimjuIevadeUnAprekinasana.Grade(
                        skoleni, kriterijisk, kriterijs);

        double[] rezultati =
                AtzimjuIevadeUnAprekinasana.FinGrade(
                        skoleni, kriterijisk, atzimes, procenti);

        datne.ieglabat(
                skoleni,
                kriterijisk,
                kriterijs,
                procenti,
                atzimes,
                rezultati
        );
    }
}