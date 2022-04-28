package main.java.kivipaperisakset;

import kivipaperisakset.Pelaaja;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testaa Pelaajan luokan metodit
 */
class PelaajaTest {
    Pelaaja p = new Pelaaja();

    /**
     * Testaa pelaajan valintaa, ajamalla repeatedTest voidaan varmistaa, että ei tule
     * mitään yllättävää ulos metodista
     */
    @RepeatedTest(10)
    public void pelaajanValinta() {
        String[] expectedTitles = {"sakset", "kivi", "paperi"};
        List<String> expectedTitlesList = Arrays.asList(expectedTitles);
        Assertions.assertTrue(expectedTitlesList.contains((p.pelaajanValinta())));
    }

    /**
     * Testaa voittojen lkm lisäämistä pelaajalle
     */
    @Test
    public void setVoitot() {
        assertEquals(1,p.setVoitot());
    }

    /**
     * Tarkistaa, että palauttaa oikean arvon, eikä muunna sitä mitenkään
     */
    @Test
    public void getVoitot() {
        assertEquals(0, p.getVoitot());
    }
}