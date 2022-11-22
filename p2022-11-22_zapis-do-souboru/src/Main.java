public class Main {
    private static final String NAZEV_SOUBORU = "vstup.txt";
    private static final String ODDELOVAC = ";";


    public static void main(String[] args) {

        SeznamUkolu seznamUkolu = new SeznamUkolu();

        try {
            seznamUkolu.nactiZeSouboru(NAZEV_SOUBORU, ODDELOVAC);
        } catch (UkolyException e) {
            System.err.println("Chyba při čtení ze souboru:\n"
                    +e.getLocalizedMessage());
        }

        // Varianta 1:
        int poradi = 1;
        for (Ukol ukol : seznamUkolu.getList()) {
            System.out.println(
                    poradi + ") " + ukol.getPopis() + ": " + ukol.getPocetPracovniku()
                            + " osob (" + ukol.getOdmena() + " Kč)");
            poradi++;
        }

        // Výpis varianta 2 (ale bez čísel)
        seznamUkolu.getList().forEach(System.out::println);
    }
}