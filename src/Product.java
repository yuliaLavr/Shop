public abstract class Product {
    public String name;
    public int quanty;

    public Product(String name) {
        this.name = name;
    }
    public void checkStock(int quantity) throws OutOfStockException {
        if (quantity <= 0) {
            throw new OutOfStockException();
        }
        System.out.println("Товар у наявності: " + quantity + " одиниць.");

    public String getName() {
        return name;
    }
    public abstract String getDetails();
    }
}
