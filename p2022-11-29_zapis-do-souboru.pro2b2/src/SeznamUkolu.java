import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeznamUkolu {

    private List<Ukol> ukoly = new ArrayList<>();

    public void nactiZeSouboru(String nazevSouboru, String oddelovac) throws UkolyException {
        int cisloRadku = 1;
        String[] polozky = new String[2];
        String radek = "NO LINE READ YET!";

        try (Scanner scanner =
                     new Scanner(new BufferedReader(new FileReader(nazevSouboru)))
        ) {
            while (scanner.hasNextLine()) {
                radek = scanner.nextLine();
                polozky = radek.split(oddelovac);
                String popis = polozky[0].trim();
                BigDecimal odmena = new BigDecimal(polozky[1].trim());
                int pocetPracovniku = Integer.parseInt(polozky[2].trim());
                Ukol ukol = new Ukol(popis, pocetPracovniku, odmena);
                ukoly.add(ukol);
                cisloRadku++;
            }
        } catch (FileNotFoundException ex) {
            throw new UkolyException("Soubor "+nazevSouboru+" nenalezen!"+ex.getMessage());
        } catch (NumberFormatException ex) {
            throw new UkolyException(
                    "Nepodařilo se přečíst číslo "+polozky[1]+" na řádku "+cisloRadku
                            +" ("+ex.getMessage()+")");
        }
    }

    public void zapisDoSouboru(String nazevSouboru, String oddelovac)
            throws UkolyException {
try (PrintWriter writer =
        new PrintWriter(
                new BufferedWriter(
                        new FileWriter(
                                nazevSouboru)))) {
    // Tady realizujeme zápis: ;)
    String radek;
    for (Ukol ukol : ukoly) {
        radek = ukol.getPopis() + oddelovac
                + ukol.getOdmena() + oddelovac
                + ukol.getPocetPracovniku();
        writer.println(radek);
        // Můžeme použít: writer.flush();
    }
} catch (IOException e) {
    throw new UkolyException(
            "Chyba při zápisu do souboru: "
                    +e.getMessage());
}
    }

    public List<Ukol> getList() {
        return new ArrayList<>(ukoly);
    }

    public void pridej(Ukol novyUkol) {
        ukoly.add(novyUkol);
    }

    public void odeber(int index) {
        ukoly.remove(index);
    }
}
