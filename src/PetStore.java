import java.util.ArrayList;
import java.util.List;
public class PetStore {
    private List<Sale>products=new ArrayList<>();
    public void addProduct(Sale product) {
        products.add(product);
    }
    public void showProducts() {
        for (Sale product : products) {
            if (product instanceof Product) {
                System.out.println(((Product) product).getDetails() + " - ціна: " + product.getPrice() + " грн");
            }
        }
    }
}
