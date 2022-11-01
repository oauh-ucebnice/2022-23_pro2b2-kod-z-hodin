package cz.oauh.test20221017;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SkladovaPolozka {
    public static final int DEFAULT_POCET_NA_SKLADE = 0;
    public static final int DEFAULT_HMOTNOST_NA_KS = 0;
    private String nazev;
    private int pocetNaSklade;
    private double hmotnostNaKs;
    private BigDecimal cenaZaKs;
    private boolean jeVNabidce;
    private LocalDate datumDoProdeje;

    public SkladovaPolozka(String nazev, int pocetNaSklade,
                           double hmotnostNaKs,
                           BigDecimal cenaZaKs,
                           boolean jeVNabidce,
                           LocalDate datumDoProdeje) {
        this.nazev = nazev;
        this.pocetNaSklade = pocetNaSklade;
        this.hmotnostNaKs = hmotnostNaKs;
        this.cenaZaKs = cenaZaKs;
        this.jeVNabidce = jeVNabidce;
        this.datumDoProdeje = datumDoProdeje;
    }

    public SkladovaPolozka(String nazev, BigDecimal cenaZaKs) {
        this(nazev, DEFAULT_POCET_NA_SKLADE, DEFAULT_HMOTNOST_NA_KS, cenaZaKs,
                true, LocalDate.now());
    }

//    public cz.oauh.test20221017.SkladovaPolozka(String nazev, BigDecimal cenaZaKs) {
//        this.nazev = nazev;
//        this.cenaZaKs = cenaZaKs;
//        this.datumDoProdeje = LocalDate.now();
//    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getPocetNaSklade() {
        return pocetNaSklade;
    }

    public void setPocetNaSklade(int pocetNaSklade) {
        this.pocetNaSklade = pocetNaSklade;
    }

    public double getHmotnostNaKs() {
        return hmotnostNaKs;
    }

    public void setHmotnostNaKs(double hmotnostNaKs) {
        this.hmotnostNaKs = hmotnostNaKs;
    }

    public BigDecimal getCenaZaKs() {
        return cenaZaKs;
    }

    public void setCenaZaKs(BigDecimal cenaZaKs) {
        this.cenaZaKs = cenaZaKs;
    }

    public boolean isJeVNabidce() {
        return jeVNabidce;
    }

    public void setJeVNabidce(boolean jeVNabidce) {
        this.jeVNabidce = jeVNabidce;
    }

    public LocalDate getDatumDoProdeje() {
        return datumDoProdeje;
    }

    public void setDatumDoProdeje(LocalDate datumDoProdeje) {
        this.datumDoProdeje = datumDoProdeje;
    }

    @Override
    public String toString() {
        return "SkladovaPolozka{" +
                "nazev='" + nazev + '\'' +
                ", pocetNaSklade=" + pocetNaSklade +
                ", cenaZaKs=" + cenaZaKs +
                '}';
    }
}
