package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] supermarket = new Artikl[1000];

    void dodajArtikl(Artikl artikl) {
        for (int i = 0; i < supermarket.length; i++) {
            if (supermarket[i] == null) {
                supermarket[i] = artikl;
                break;
            }
        }
    }

    Artikl[] getArtikli() {
        return supermarket;
    }

    Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = new Artikl();
        for (int i = 0; i < supermarket.length; i++) {
            if(supermarket[i]!=null)
            if (supermarket[i].kod.equals(kod)) {
                a = supermarket[i];
                supermarket[i] = null;
                break;
            }
        }
        return a;
    }
}
