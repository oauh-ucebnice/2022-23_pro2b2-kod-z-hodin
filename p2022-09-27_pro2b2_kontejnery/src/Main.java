import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> seznam = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Integer nahodne = (int)(Math.random()*99+1);
            seznam.add(nahodne);
        }

        // Výpis na jeden řádek: System.out.println(seznam);
        // Výpis ručně pomocí cyklu:
        for (Integer i : seznam) {
            System.out.println(i);
        }

        System.out.println("Součet: "+
                (seznam.stream().reduce(Integer::sum).get())
        );
        System.out.println("Součet: "+
                (seznam.stream().mapToInt(a -> a).sum())
        );
        System.out.println("Největší číslo: "+
                Collections.max(seznam)
        );
        System.out.println("Nejmenší číslo: "+
                Collections.min(seznam)
        );
    }
}