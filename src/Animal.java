public class Animal extends Product implements Sale {
    private int age;
    private double price;

    public Animal(String name, int age, double price) {
        super(name);
        this.age = age;
        this.price = price;
    }
    public int getAge(){
        return age;
    }
    @Override
    public double getPrice(){
        return price;
    }
    @Override
    public String getDetails(){
        return "Тварина: "+getName() +", вік: "+age+" років";
    }
}
