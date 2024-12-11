import java.util.ArrayList;
import java.util.List;
public class PetStore {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println(product.getDetails());
            System.out.println("Кількість: " + product.quantity);
            if (product instanceof Sale) {
                System.out.println("Ціна: " + ((Sale) product).getPrice());
            }
        }
    }

    public void sellProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                try {
                    product.checkStock(); // Перевіряємо наявність
                    product.reduceStock(); // Зменшуємо кількість
                    System.out.println("Товар \"" + productName + "\" успішно продано.");
                } catch (OutOfStockException e) {
                    System.err.println("Неможливо продати \"" + productName + "\": " + e.getMessage());
                }
                return;
            }
        }
        System.err.println("Товар \"" + productName + "\" не знайдено у магазині.");
    }
}

