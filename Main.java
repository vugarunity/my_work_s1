public class Main {
    public static void main(String[] args) {
        // Создаем автомат
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();

        // Создаем горячие напитки
        HotDrinkWithTemperature Tea = new HotDrinkWithTemperature("Tea", 250, 90);
        HotDrinkWithTemperature Coffee = new HotDrinkWithTemperature("Coffee", 200, 90);
        HotDrinkWithTemperature Cacao = new HotDrinkWithTemperature("Cacao", 300, 85);

        // Добавляем напитки в автомат
        machine.addProduct(Tea);
        machine.addProduct(Coffee);
        machine.addProduct(Cacao);

        // Запрашиваем напиток
        HotDrinkWithTemperature RequestedDrink = machine.getProduct("Coffee", 200, 90);

        // Проверяем результат
        if (RequestedDrink != null) {
            System.out.println("Dispensed drink: " + RequestedDrink);
        } else {
            System.out.println("Such drink not found");
        }
    }
}
