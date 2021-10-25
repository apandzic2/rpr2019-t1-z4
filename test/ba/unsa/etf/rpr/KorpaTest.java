package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Hljeb", 1, "123");
        k.dodajArtikl(a);
        assertEquals(k.korpa[0].getNaziv(), "Hljeb");
        assertEquals(k.korpa[0].getCijena(), 1);
        assertEquals(k.korpa[0].getKod(), "123");
    }

    @Test
    void getArtikli() {
        Korpa k = new Korpa();
        assertNotNull(k.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Hljeb", 1, "123");
        k.dodajArtikl(a);
        k.izbaciArtiklSaKodom("123");
        assertNull(k.getArtikli()[0]);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k = new Korpa();
        Artikl a = new Artikl("Hljeb", 1, "123");
        Artikl b = new Artikl("Hljeb", 2, "124");
        Artikl c = new Artikl("Hljeb", 3, "125");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);
        assertEquals(k.dajUkupnuCijenuArtikala(), 6);
    }
}