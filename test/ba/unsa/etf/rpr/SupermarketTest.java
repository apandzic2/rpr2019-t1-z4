package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Hljeb", 1, "123");
        s.dodajArtikl(a);
        assertEquals(s.supermarket[0].getNaziv(), "Hljeb");
        assertEquals(s.supermarket[0].getCijena(), 1);
        assertEquals(s.supermarket[0].getKod(), "123");
    }

    @Test
    void getArtikli() {
        Supermarket s = new Supermarket();
        assertNotNull(s.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Hljeb", 1, "123");
        s.dodajArtikl(a);
        s.izbaciArtiklSaKodom("123");
        assertNull(s.getArtikli()[0]);
    }
}