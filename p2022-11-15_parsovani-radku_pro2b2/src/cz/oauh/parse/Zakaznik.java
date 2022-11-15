package cz.oauh.parse;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Zakaznik {
    private String jmeno;
    private int pocetZamestnancu;
    private double vzdalenostSidla;
    private BigDecimal celkovyObrat;
    private LocalDate datumRegistrace;

    public Zakaznik(String jmeno, int pocetZamestnancu, double vzdalenostSidla, BigDecimal celkovyObrat, LocalDate datumRegistrace) {
        this.jmeno = jmeno;
        this.pocetZamestnancu = pocetZamestnancu;
        this.vzdalenostSidla = vzdalenostSidla;
        this.celkovyObrat = celkovyObrat;
        this.datumRegistrace = datumRegistrace;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getPocetZamestnancu() {
        return pocetZamestnancu;
    }

    public void setPocetZamestnancu(int pocetZamestnancu) {
        this.pocetZamestnancu = pocetZamestnancu;
    }

    public double getVzdalenostSidla() {
        return vzdalenostSidla;
    }

    public void setVzdalenostSidla(double vzdalenostSidla) {
        this.vzdalenostSidla = vzdalenostSidla;
    }

    public BigDecimal getCelkovyObrat() {
        return celkovyObrat;
    }

    public void setCelkovyObrat(BigDecimal celkovyObrat) {
        this.celkovyObrat = celkovyObrat;
    }

    public LocalDate getDatumRegistrace() {
        return datumRegistrace;
    }

    public void setDatumRegistrace(LocalDate datumRegistrace) {
        this.datumRegistrace = datumRegistrace;
    }
}
