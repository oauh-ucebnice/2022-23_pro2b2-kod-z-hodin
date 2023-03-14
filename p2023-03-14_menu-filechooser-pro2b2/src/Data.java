import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<String> names
            = new ArrayList();
    private int aktualniIndex = 0;

    public void loadFromFile(File file) {
        // Tady by se načetlo ze souboru...
        // Místo toho uděláme:
        names = new ArrayList<>();
        names.add("Karel");
        names.add("Adéla");
        names.add("Jolana");
        aktualniIndex = 0;
    }

    public void next() {
        aktualniIndex++;
        if (aktualniIndex >= names.size()) {
            aktualniIndex = 0;
        }
    }

    public String getAktualniJmeno() {
        if (names.size() == 0) {
            return "== není co zobrazit ==";
        }
        return names.get(aktualniIndex);
    }

    public String getAktualniIndex() {
        if (names.size() == 0) {
            return "== není co zobrazit ==";
        }
        return ""+aktualniIndex;
    }
}
