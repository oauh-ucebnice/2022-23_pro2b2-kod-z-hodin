import java.math.BigDecimal;
import java.time.LocalDate;


public class Nakup {
    LocalDate datum;
    BigDecimal castka;
    String popis;
    boolean jeMimoradny;

    public Nakup(LocalDate datum, BigDecimal castka, String popis, boolean jeMimoradny) {
        this.datum = datum;
        this.castka = castka;
        this.popis = popis;
        this.jeMimoradny = jeMimoradny;
    }

    public Nakup(BigDecimal castka, String popis) {
        this(LocalDate.now(), castka, popis, false);
    }

    public Nakup(BigDecimal castka) {
        this(castka, "Jiné zboží");
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public BigDecimal getCastka() {
        return castka;
    }

    public void setCastka(BigDecimal castka) {
        this.castka = castka;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public boolean isJeMimoradny() {
        return jeMimoradny;
    }

    public void setJeMimoradny(boolean jeMimoradny) {
        this.jeMimoradny = jeMimoradny;
    }
}
