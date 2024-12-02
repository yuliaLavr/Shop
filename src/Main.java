public class Main {
    public static void main(String[] args) {
        PetStore store = new PetStore();

        // Створюємо тварин
        Animal dog = new Animal("Бобік", 3, 5000.0);
        Animal cat = new Animal("Мурчик", 2, 3000.0);

        // Створюємо аксесуари
        Accessory collar = new Accessory("Нашийник", "Шкіряний", 1150.0);
        Accessory bed = new Accessory("Ліжко", "М'яке", 1000.0);

        Animal fish = new Animal("Kysa");
        try{
            fish.addAnimal("");
        }
        catch(IncorrectInfAnimalException ee){
            System.err.println(ee.getMessage());
        }
        Accessory c=new Accessory("Повідок", "Шкіряний", 1250.0);
        try {
            c.checkStock(0);
        } catch (OutOfStockException p) {
            System.err.println(p.getMess());
        }

        // Додаємо товари до магазину
        store.addProduct(dog);
        store.addProduct(cat);
        store.addProduct(collar);
        store.addProduct(bed);

        // Виводимо на екран всі товари
        store.showProducts();
    }
}