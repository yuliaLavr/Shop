public class Accessory extends Product implements Sale{
    private String type;
    private double price;

    public Accessory(java.lang.String name, java.lang.String type, double price) {
        super(name);
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
