package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] korpa = new Artikl[50];

    Korpa() {
    }

    boolean dodajArtikl(Artikl artikl) {
        for (int i = 0; i < korpa.length; i++) {
            if (korpa[i] == null) {
                korpa[i] = artikl;
                return true;
            }
        }
        return false;
    }

    Artikl[] getArtikli() {
        return korpa;
    }

    Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = new Artikl();
        for (int i = 0; i < korpa.length; i++) {
            if(korpa[i]!=null)
            if (korpa[i].kod.equals(kod)) {
                a = korpa[i];
                korpa[i] = null;
                break;
            }
        }
        return a;
    }

    int dajUkupnuCijenuArtikala() {
        int ukupna=0;
        for(Artikl a: korpa) {
            if(a!=null)
            ukupna += a.cijena;
        }
        return ukupna;
    }
}
