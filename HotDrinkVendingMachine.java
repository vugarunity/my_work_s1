import java.util.ArrayList;
import java.util.List;

class HotDrinkVendingMachine implements ProductMachine {
    private List<HotDrinkWithTemperature> products = new ArrayList<>();

    public void addProduct(HotDrinkWithTemperature product) {
        products.add(product);
    }

    @Override
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemperature product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                return product;
            }
        }
        return null; 
    }
}
