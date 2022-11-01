import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String NAZEV_SOUBORU = "soubor.txt";

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(
                new BufferedReader(
                        new FileReader(NAZEV_SOUBORU)))) {
            // ... popis práce se souborem...
            while (scanner.hasNextLine()) {
                String dalsiRadek = scanner.nextLine();
                list.add(dalsiRadek);
                // list.add(scanner.nextLine());
            }
            // ... konec práce se souborem...
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        list.forEach(System.out::println);

    }
}