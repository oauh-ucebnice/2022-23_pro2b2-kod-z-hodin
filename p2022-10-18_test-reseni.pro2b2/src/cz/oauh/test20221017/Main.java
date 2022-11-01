package cz.oauh.test20221017;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EvidenceSkladovychZasob evidence =
                new EvidenceSkladovychZasob();
        evidence.pridej(
                new SkladovaPolozka(
                        "Květináč plastový",
                        84, 12,
                        BigDecimal.valueOf(25),
                        true,
                        LocalDate.of(1993,2,14))
        );
        evidence.pridej(
                new SkladovaPolozka(
                        "Poznámkový blok A6+",
                        10,
                        SkladovaPolozka.DEFAULT_HMOTNOST_NA_KS,
                        BigDecimal.valueOf(12.5),
                        true,
                        LocalDate.of(1993,2,14))
        );
        evidence.pridej(
                new SkladovaPolozka(
                        "Pokus",
                        BigDecimal.valueOf(12.5))
        );

        for (SkladovaPolozka polozka :
                evidence.ziskejPolozky()) {
            System.out.println(polozka);
        }
    }
}