public class Zamestnanec
        extends VyrobniZdroj // Pokud toto potřebuji,
            // tak nemohu použít zároveň `extends Osoba`
            // a musím místo dědičnosti použít rozhraní.
        implements Osoba {
    @Override
    public int getVek() {
        return 0;
    }
}
