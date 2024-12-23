public class Animal extends Product implements Sale {
    private final int age;
    private final double price;

    public Animal(String name, int age, double price, int quantity) {
        super(name,quantity);
        this.age = age;
        this.price = price;
    }

    public void addAnimal(String name) throws IncorrectInfAnimalException{
        if (name == null || name.isEmpty()) {
            throw new IncorrectInfAnimalException();
        }
        this.name=name;
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
