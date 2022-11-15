package cz.oauh.parse;

public class Main {
    public static void main(String[] args) {

        Zakaznici zakaznici = new Zakaznici();
        try {

            zakaznici.nactiZeSouboru("zakaznici.txt");

        } catch (ZakazniciException e) {
            System.err.println(
                    "Chyba při čtení ze souboru: "
                    +e.getLocalizedMessage()
            );
        }

        System.out.println(zakaznici.getList());
    }
}