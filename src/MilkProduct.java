import java.time.LocalDate;

public abstract class MilkProduct extends Product {
    public MilkProduct(int id, String name, String companyNmae, LocalDate localDate) {
        super(id, name, companyNmae, localDate);
    }
}
