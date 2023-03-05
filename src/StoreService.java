import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class StoreService {
    public void addNewproduct(Product product, List array) {
        if ((product.getCompanyNmae() == "HalalMeat" || product.getCompanyNmae() == "HalalMilk" || product.getCompanyNmae() == "HalalFlour")) {
            if (product.getLocalDate().isAfter(LocalDate.now())) {
                array.add(product);

            } else System.out.println("prosrochka");
        } else System.out.println("S takoi kompaniei ne rabotaem");

    }

    public void sortByDiscont(List<Product> massiv, List discontArray) {
        // LocalDate localDate = LocalDate.now().minusDays(7);
        for (Product a : massiv) {

            if (a.getLocalDate().minusDays(7).isBefore(LocalDate.now())) {
                discontArray.add(a);
            }


        }


    }

    public void liginPassword(String login, String password, List<Product> array) {
        if (login.equals("user") && password.equals("password")) {

            System.out.println("Parol vernyi");
            System.out.println(Arrays.asList(array));

        } else {
            System.out.println("Ne verno");

        }


    }
}






















