import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nakup> nakupy = new ArrayList<>();
        nakupy.add(new Nakup(
                "rohlíky",
                LocalDate.now(),
                BigDecimal.valueOf(15.0),
                false
                ));
        for (Nakup nakup : nakupy) {
            System.out.println(
                    nakup.getPopis()
                    + " ("
                    + nakup.getCena()
                    + ")"
            );
        }
    }
}