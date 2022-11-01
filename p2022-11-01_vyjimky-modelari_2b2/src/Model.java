import java.time.LocalDate;

public class Model {
    private Modelar vlastnik;
    private String nazevLetadla;
    private int meritko;
    private LocalDate datumVyroby;
    private boolean jeSoutezni;

    public Model(Modelar vlastnik, String nazevLetadla, int meritko, LocalDate datumVyroby, boolean jeSoutezni)
            throws Exception {
        this.vlastnik = vlastnik;
        this.nazevLetadla = nazevLetadla;
        this.setMeritko(meritko);
        this.datumVyroby = datumVyroby;
        this.jeSoutezni = jeSoutezni;
    }

    public Modelar getVlastnik() {
        return vlastnik;
    }

    public void setVlastnik(Modelar vlastnik) {
        this.vlastnik = vlastnik;
    }

    public String getNazevLetadla() {
        return nazevLetadla;
    }

    public void setNazevLetadla(String nazevLetadla) {
        this.nazevLetadla = nazevLetadla;
    }

    public int getMeritko() {
        return meritko;
    }

    public void setMeritko(int meritko) throws Exception {
        if (meritko <= 0) {
            // throw new RuntimeException(
            throw new Exception(
                    "Špatně nastavené měřítko: "+meritko
                            +"! Měřítko musí být >= 0.");
        }
        this.meritko = meritko;
    }

    public LocalDate getDatumVyroby() {
        return datumVyroby;
    }

    public void setDatumVyroby(LocalDate datumVyroby) {
        this.datumVyroby = datumVyroby;
    }

    public boolean isJeSoutezni() {
        return jeSoutezni;
    }

    public void setJeSoutezni(boolean jeSoutezni) {
        this.jeSoutezni = jeSoutezni;
    }
}
