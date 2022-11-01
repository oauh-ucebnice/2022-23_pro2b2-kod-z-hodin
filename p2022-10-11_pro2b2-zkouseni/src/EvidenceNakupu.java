import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EvidenceNakupu {
    List<Nakup> nakupy = new ArrayList<>();

    public void pridej(Nakup nakup) {
        nakupy.add(nakup);
    }

    public int pocetNakupu() {
        return nakupy.size();
    }

    public void vymazNakup(Nakup nakup) {
        nakupy.remove(nakup);
    }

    public List<Nakup> getNakupy() {
        return new ArrayList<>(nakupy); // vytvoří kopii seznamu
    }

    public BigDecimal getCelkovaCena() {
        for (Nakup nakup : nakupy) {

        }
    }
}
