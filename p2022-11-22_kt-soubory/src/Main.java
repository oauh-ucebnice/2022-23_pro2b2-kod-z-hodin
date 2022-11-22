import javax.print.attribute.standard.MediaSize;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private static final String NAZEV_SOUBORU = "vstup.txt";
    private static final String ODDELOVAC = ";";

    public static void main(String[] args) {
        int cisloRadku = 1;
        String[] polozky = new String[2];
        String radek = "NO LINE READ YET!";

        try (Scanner scanner =
                     new Scanner(new BufferedReader(new FileReader(NAZEV_SOUBORU)))
        ) {
            while (scanner.hasNextLine()) {
                radek = scanner.nextLine();
                polozky = radek.split(ODDELOVAC);
                String popis = polozky[0].trim();
                BigDecimal odmena = new BigDecimal(polozky[1].trim());
                int pocetPracovniku = Integer.parseInt(polozky[2].trim());
                System.out.println(
                        cisloRadku + ") " + popis + ": " + pocetPracovniku
                                + " osob (" + odmena + " Kč)");
                cisloRadku++;
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Soubor "+NAZEV_SOUBORU+" nenalezen!"+ex.getMessage());
        } catch (NumberFormatException ex) {
            System.err.println(
                    "Nepodařilo se přečíst číslo "+polozky[1]+" na řádku "+cisloRadku
                            +" ("+ex.getMessage()+")");
        }
    }
}