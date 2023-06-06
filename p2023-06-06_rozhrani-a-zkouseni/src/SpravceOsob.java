import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpravceOsob {
    private List<Osoba> osobyVeFirme
            = new ArrayList<>();
    public SpravceOsob() {
        osobyVeFirme.add(new Zamestnanec());
        osobyVeFirme.add(
                new Host(LocalDate.of(1998,6,5)));
        // NEJDE: osobyVeFirme.add(new Osoba());
    }
    public List<Osoba> getOsobyStarsiNez(int limit) {
        List<Osoba> seznamStarsich = new ArrayList<>();
        for (Osoba osoba : osobyVeFirme) {
            if (osoba.getVek() >= 18) {
                seznamStarsich.add(osoba);
            }
        }
        return seznamStarsich;
    }
}
