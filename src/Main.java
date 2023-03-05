import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String login;
        String password;
        System.out.println("Vvedite login: ");
        login=scan.next();
        System.out.println("Vvedite parol:");
        password=scan.next();
        List<Product> products=new ArrayList<>();
        products.add(new Fish(1,"fish1","HalalMeat", LocalDate.of(2023,3,8)));
        products.add(new LamberMeet(1,"lambmeat","HalalMeat", LocalDate.of(2023,3,6)));
        products.add(new Sousege(1,"sausage","HalalMeat", LocalDate.of(2023,4,6)));
        products.add(new Fish(2,"fish2","HalalMeat", LocalDate.of(2023,4,6)));
        products.add(new Pasta(1,"pasta","HalalFlour", LocalDate.of(2023,3,8)));
        products.add(new Torment(1,"torment","HalalFlour", LocalDate.of(2023,4,6)));
        products.add(new Kefir(1,"kefir","HalalMilk", LocalDate.of(2023,4,6)));
        products.add(new Milk(1,"milk","HalalMilk", LocalDate.of(2023,4,6)));
        products.add(new SourCream(1,"sourCream","HalalMilk", LocalDate.of(2023,4,6)));

    Sousege et=new Sousege(1, "et", "HalalMeat", LocalDate.of(2023, 3, 1));
        Milk sut=new Milk(1, "sut", "HalalFlour", LocalDate.of(2023, 3, 6));
        Torment nan=new Torment(1, "nan", "HalalMilk", LocalDate.of(2023, 3, 6));
        List<Product>sortArray=new ArrayList<>();

     StoreService storeService=new StoreService();
//        storeService.addNewproduct(et,products);
//        storeService.addNewproduct(sut,products);
//        storeService.addNewproduct(nan,products);
//        storeService.sortByDiscont(products,sortArray);
//        System.out.println(products);
//        System.out.println("Tovar so skidkoy");
//        System.out.println(sortArray);
        storeService.liginPassword(login,password,products);




    }


}