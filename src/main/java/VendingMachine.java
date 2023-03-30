import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> products = new ArrayList<Product>();
    public Product getProductByName(String name){
        for (Product product: products) {
            if (product.getName() == name){
                return product;
            }

        }
        return null;
    }
    public Product getProductByPrise(int cost){
        for (Product product: products) {
            if (product.getCost() == cost){
                return cost;
            }

        }
        return null;
    }
    public void addProduct(String name, int cost){
        Product Product = new Product(name, cost);

        products.add(Product);
    }
}
