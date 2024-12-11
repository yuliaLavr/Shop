public abstract class Product {
    public String name;
    public int quantity;

    public Product(String name,int quantity) {
        this.name = name;
        this.quantity=quantity;
    }
    public void checkStock() throws OutOfStockException {
        if (quantity <= 0) {
            throw new OutOfStockException();
        }
    }
    public void reduceStock(){
        if(quantity>0){
            quantity--;
        }
    }
    public String getName() {
        return name;
    }
    public abstract String getDetails();
    }

