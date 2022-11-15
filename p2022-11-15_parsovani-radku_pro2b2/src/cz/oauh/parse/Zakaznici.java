package cz.oauh.parse;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zakaznici {
    public static final String ODDELOVAC = ";";

    private List<Zakaznik> zakaznikList
            = new ArrayList<>();

    public void nactiZeSouboru(String nazevSouboru)
            throws ZakazniciException {
        try (Scanner scanner = new Scanner(
                new BufferedReader(
                        new FileReader(nazevSouboru)))) {
            while (scanner.hasNextLine()) {
                String radek = scanner.nextLine();
                // rozděl řádky na položky (pole Stringů):
                String[] polozky = radek.split(ODDELOVAC);
                int pocetZamestnancu    = Integer.parseInt(polozky[1]);
                double vzdalenost       = Double.parseDouble(polozky[2]);
                BigDecimal obrat        = new BigDecimal(polozky[3]);
                LocalDate datum         = LocalDate.parse(polozky[4]);
                zakaznikList.add(
                        new Zakaznik(
                                polozky[0], pocetZamestnancu,
                                vzdalenost, obrat, datum
                        ));
            }
        } catch (FileNotFoundException e) {
            throw new ZakazniciException(
                    "Soubor "+nazevSouboru+" nenalezen! "
                    + e.getMessage()
            );
        }
    }
    public List<Zakaznik> getList() {
        return new ArrayList<>(zakaznikList);
    }
}
