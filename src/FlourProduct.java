import java.time.LocalDate;

public abstract class FlourProduct extends Product {
    public FlourProduct(int id, String name, String companyNmae, LocalDate localDate) {
        super(id, name, companyNmae, localDate);
    }
}
