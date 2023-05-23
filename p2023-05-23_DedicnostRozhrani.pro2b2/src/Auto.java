public class Auto {
    private int pocetPasazeru;
    private final int maxPasazeru;

    public Auto(int maxPasazeru) {
        this.pocetPasazeru = 0;
        this.maxPasazeru = maxPasazeru;
    }
    public void pridejPasazera() throws AutoException {
        pridejPasazery(1);
    }
    public void pridejPasazery(int pocetPasazeruNavic) throws AutoException {
        int vyslednyPocetPasazeru = this.pocetPasazeru+pocetPasazeruNavic;
        if (vyslednyPocetPasazeru > maxPasazeru
                ||
            vyslednyPocetPasazeru < 0
        ) {
            throw new AutoException(
                    "Překročili jsme hranice počtu pasažérů 0 až "
                            +maxPasazeru
                            +"\nAktuální stav: "+pocetPasazeru
                            +"\nNoví pasažéři: "+pocetPasazeruNavic);
        }
        pocetPasazeru = vyslednyPocetPasazeru;
    }

}
