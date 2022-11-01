package cz.oauh.test20221017;

import java.util.ArrayList;
import java.util.List;

public class EvidenceSkladovychZasob {
    private List<SkladovaPolozka> polozky
            = new ArrayList<>();

    public void pridej(SkladovaPolozka polozka) {
        polozky.add(polozka);
    }

    public void smaz(SkladovaPolozka polozka) {
        polozky.remove(polozka);
    }

    public List<SkladovaPolozka> ziskejPolozky() {
        return new ArrayList<>(polozky);
    }

    public SkladovaPolozka polozkaCislo(int cislo) {
        return polozky.get(cislo);
    }
}
