import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zak> zaci = new ArrayList<>();
        zaci.add(
                new Zak("Karel",
                        LocalDate.of(2022,
                                10,
                                4)));
        for (Zak zak : zaci) {
            System.out.println(zak.getJmeno());
        }
        System.out.println(zaci.size());
    }
}