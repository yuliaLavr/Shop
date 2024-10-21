public abstract class Product {
    public String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract String getDetails();
}
