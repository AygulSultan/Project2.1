import java.time.LocalDate;

public abstract class Product {
    private int id;
    private String name;
    private String companyNmae;
    private LocalDate localDate;

    public Product(int id, String name, String companyNmae, LocalDate localDate) {
        this.id = id;
        this.name = name;
        this.companyNmae = companyNmae;
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyNmae() {
        return companyNmae;
    }

    public void setCompanyNmae(String companyNmae) {
        this.companyNmae = companyNmae;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companyNmae='" + companyNmae + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
