public class Accessory extends Product implements Sale{
    private final String type;
    private final double price;

    public Accessory(String name, String type, double price, int quantity) {
        super(name,quantity);
        this.type = type;
        this.price = price;
    }
    public String getType(){
        return type;
    }
    @Override
    public double getPrice(){
        return price;
    }
    @Override
    public String getDetails(){
        return "Аксесуар: "+getName() +", тип: "+type;
    }
}
