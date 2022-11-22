import java.math.BigDecimal;

public class Ukol {
    private String popis;
    private int pocetPracovniku;
    private BigDecimal odmena;

    public Ukol(String popis, int pocetPracovniku, BigDecimal odmena) {
        this.popis = popis;
        this.pocetPracovniku = pocetPracovniku;
        this.odmena = odmena;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public int getPocetPracovniku() {
        return pocetPracovniku;
    }

    public void setPocetPracovniku(int pocetPracovniku) {
        this.pocetPracovniku = pocetPracovniku;
    }

    public BigDecimal getOdmena() {
        return odmena;
    }

    public void setOdmena(BigDecimal odmena) {
        this.odmena = odmena;
    }

    @Override
    public String toString() {
        return popis+": "+pocetPracovniku+" pracovníků ("+odmena+" Kč)";
    }
}
