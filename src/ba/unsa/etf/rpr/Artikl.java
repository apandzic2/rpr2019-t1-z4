package ba.unsa.etf.rpr;

public class Artikl {
    String ime, kod;
    int cijena;

    Artikl() {
        ime = "";
        kod = "";
        cijena = 0;
    }

    Artikl(String ime, int cijena, String kod) {
        this.ime = ime;
        this.cijena = cijena;
        this.kod = kod;
    }

    String getNaziv() {
        return ime;
    }

    String getKod() {
        return kod;
    }

    int getCijena() {
        return cijena;
    }
}
