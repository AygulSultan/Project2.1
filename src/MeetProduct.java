import java.time.LocalDate;

public abstract class MeetProduct extends Product{
    public MeetProduct(int id, String name, String companyNmae, LocalDate localDate) {
        super(id, name, companyNmae, localDate);
    }
}
