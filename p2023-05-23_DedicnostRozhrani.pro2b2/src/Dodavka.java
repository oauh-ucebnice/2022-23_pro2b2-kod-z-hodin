public class Dodavka extends Auto {
    // Dědičnost (inheritance) -> klíčové slovo extends
    private int maxZatizeni;
    private int aktualniVahaNakladu;

    public Dodavka(int maxPasazeru, int maxZatizeni) {
        super(maxPasazeru);

        this.maxZatizeni = maxZatizeni;
        this.aktualniVahaNakladu = 0;
    }
    public void pridejNaklad(int vahaNakladuNavic) throws AutoException {
        int vyslednaVahaNakladu = this.aktualniVahaNakladu +vahaNakladuNavic;
        if (vyslednaVahaNakladu > maxZatizeni
                ||
                vyslednaVahaNakladu < 0
        ) {
            throw new AutoException(
                    "Překročili jsme hranici zatížení 0 až "
                            +maxZatizeni
                            +"\nAktuální stav: "+ aktualniVahaNakladu
                            +"\nNová zátěž: "+vahaNakladuNavic);
        }
        aktualniVahaNakladu = vyslednaVahaNakladu;
    }
}
