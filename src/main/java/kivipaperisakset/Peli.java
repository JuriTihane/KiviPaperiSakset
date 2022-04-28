package kivipaperisakset;

/**
 *
 * @author Ira Dook
 */
public class Peli {

    /**
     * Main metodi
     * @param args as parameter
     */
    public static void main(String[] args) {
        // Pelaajat
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        // Boolean pelin päättymistä varten
        boolean peliLoppui = false;
        // Pelattujen pelien lkm
        int pelatutPelit = 0;
        // Pelaajien voitto lkm
        int p1Voitot = p1.voitot;
        int p2Voitot = p2.voitot;
        // Tasapelien lkm
        int tasapelit = 0;
        // Pelaajien valinta
        String p1Valinta;
        String p2Valinta;

        // Pelataan niin pitkään kunnes ei tule 3 voittoa
        while (!peliLoppui) {
            System.out.println("Erä: " + pelatutPelit + " =====================\n");
            System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");
            p1Valinta = p1.pelaajanValinta();
            System.out.println("Pelaaja 1: " + p1Valinta + "\n\t Pelaaja 1:llä koossa " + p1Voitot + " voittoa.");
            p2Valinta = p2.pelaajanValinta();
            System.out.println("Pelaaja 2: " + p2Valinta + "\n\t Pelaaja 2:lla koossa " + p2Voitot + " voittoa.");

            // (if = tasapeli) (else if = pelaaja1 voittaa) (else = pelaaja2 voittaa)
            if (p1Valinta.equals(p2Valinta)) {
                tasapelit++;
                System.out.println("\n\t\t\t Tasapeli \n");
            } else if ((p1Valinta.equals("paperi")) && (p2Valinta.equals("kivi"))) {
                p1Voitot = p1.setVoitot();
                System.out.println("Pelaaja 1 voittaa");
            } else if ((p1Valinta.equals("kivi")) && (p2Valinta.equals("sakset"))) {
                p1Voitot = p1.setVoitot();
                System.out.println("Pelaaja 1 voittaa");
            } else if ((p1Valinta.equals("sakset")) && (p2Valinta.equals("paperi"))) {
                p1Voitot = p1.setVoitot();
                System.out.println("Pelaaja 1 voittaa");
            } else {
                p2Voitot = p2.setVoitot();
                System.out.println("Pelaaja 2 voittaa");
            }
            // Lisätään pelattujen pelien lkm
            pelatutPelit++;
            // Kun voittoja tulee 3 niin lopetetaan peli ja tulostetaan tulokset
            if ((p1.getVoitot() >= 3) || (p2.getVoitot() >= 3)) {
                peliLoppui = true;
                System.out.println("=====================\n");
                System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
                System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");
                System.out.println("Pelaaja 1:llä koossa " + p1Voitot + " voittoa.");
                System.out.println("Pelaaja 2:lla koossa " + p2Voitot + " voittoa.");
            }
        }
    }
}
