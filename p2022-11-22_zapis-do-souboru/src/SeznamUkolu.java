import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
    public List<Ukol> getList() {
        return new ArrayList<>(ukoly);
    }

}
