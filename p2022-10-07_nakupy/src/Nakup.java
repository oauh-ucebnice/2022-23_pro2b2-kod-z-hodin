import java.math.BigDecimal;
import java.time.LocalDate;

public class Nakup {
    private String popis;
    private LocalDate datum;
    private BigDecimal cena;
    private boolean jeMimoradny;

    public Nakup(String popis, LocalDate datum, BigDecimal cena, boolean jeMimoradny) {
        this.popis = popis;
        this.datum = datum;
        this.cena = cena;
        this.jeMimoradny = jeMimoradny;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public boolean isJeMimoradny() {
        return jeMimoradny;
    }

    public void setJeMimoradny(boolean jeMimoradny) {
        this.jeMimoradny = jeMimoradny;
    }
}
