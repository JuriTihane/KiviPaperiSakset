
package kivipaperisakset;

/**
 *
 * @author Ira Dook
 */
public class Pelaaja {

    /**
     * Pelaajan voittojen lkm
     */
    int voitot;

    /**
     * Valitsee randomilla kivi, paperi tai sakset
     * @return Joko kivi, paperi tai sakset
     */
    public String pelaajanValinta() {
        String valinta = null;
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0 -> valinta = ("kivi");
            case 1 -> valinta = ("paperi");
            case 2 -> valinta = ("sakset");
        }
        return valinta;
    }

    /**
     * Lisää yhden voiton ja paluttaa sen
     * @return Pelaajan voittojen lkm + 1
     */
    public int setVoitot() {
        voitot++;
        return voitot;
    }

    /**
     * Palauttaa voiton, pelin päättämistä varten
     * @return Pelaajan voittojen lkm
     */
    public int getVoitot() {
        return voitot;
    }
}
