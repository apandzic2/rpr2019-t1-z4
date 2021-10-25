package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
     void getNaziv() {
        Artikl a = new Artikl ("ArtiklA", 5, "123");
        assertEquals(a.getNaziv(), "ArtiklA");
    }

    @Test
    void getKod() {
        Artikl a = new Artikl ("ArtiklA", 5, "123");
        assertEquals(a.getKod(), "123");
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl ("ArtiklA", 5, "123");
        assertEquals(a.getCijena(), 5);
    }
}