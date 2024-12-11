public class Main {
    public static void main(String[] args) {
        PetStore store = new PetStore();

        // Створюємо тварин
        Animal dog = new Animal("Бобік", 3, 5000.0,5);
        Animal cat = new Animal("Мурчик", 2, 3000.0,2);
        Animal fish = new Animal("Kysa",1,100,1);

        // Створюємо аксесуари
        Accessory collar = new Accessory("Нашийник", "Шкіряний", 1150.0,4);
        Accessory bed = new Accessory("Ліжко", "М'яке", 1000.0,1);
        Accessory leash=new Accessory("Повідок", "Шкіряний", 1250.0, 3);

        try{
            fish.addAnimal("");
        }
        catch(IncorrectInfAnimalException ee){
            System.err.println("Помилка додавання тварини: "+ee.getMessage());
        }

        try {
            leash.checkStock();
        } catch (OutOfStockException p) {
            System.err.println("Помилка: "+p.getMessage());
        }

        // Додаємо товари до магазину
        store.addProduct(dog);
        store.addProduct(cat);
        store.addProduct(fish);
        store.addProduct(leash);
        store.addProduct(collar);
        store.addProduct(bed);

        // Виводимо на екран всі товари
        System.out.println("Список товарів у магазині: ");
        store.showProducts();

        // Продаємо товар
        System.out.println("\nПробуємо продати \"Мурчик\":");
        store.sellProduct("Мурчик");

        System.out.println("\nПробуємо продати \"Ліжко\":");
        store.sellProduct("Ліжко");

        System.out.println("\nПробуємо продати \"Ліжко\" ще раз:");
        store.sellProduct("Ліжко");

        // Виводимо оновлений список товарів
        System.out.println("\nСписок товарів після продажу:");
        store.showProducts();
    }
}