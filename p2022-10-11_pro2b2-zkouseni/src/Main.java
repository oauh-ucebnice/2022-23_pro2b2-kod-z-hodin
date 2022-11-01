import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nakup> nakupy = new ArrayList<>();
        nakupy.add(new Nakup(BigDecimal.valueOf(155.8)));
        nakupy.add(new Nakup(BigDecimal.valueOf(2000), "Cihly"));
        nakupy.add(
                new Nakup(
                        LocalDate.of(2022,10,9),
                        BigDecimal.valueOf(537.9),
                        "Písek",
                        true
                )
        );
        nakupy.forEach(
                nakup ->
                        System.out.println(nakup.getPopis()+" ("+nakup.getCastka()+")"));
    }
}