import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            Model model =
                    new Model(
                            new Modelar("Franta",2010,""),
                            "Pokus",-5, LocalDate.now(),true);
        } catch (Exception e) {
            System.err.println("Nelze vytvořit model letadla: "+e.getLocalizedMessage());
        }
        System.out.println("Aplikace běží dál!");
    }
}