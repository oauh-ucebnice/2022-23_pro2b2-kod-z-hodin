import java.time.LocalDate;
import java.time.Period;

public class Host implements Osoba {
    private LocalDate datumNarozeni;
    public Host(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }
    @Override
    public int getVek() {
        return Period.between(datumNarozeni, LocalDate.now())
                .getYears();
    }
}
