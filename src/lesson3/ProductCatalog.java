package lesson3;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    final ArrayList<Product> products = new ArrayList<>();

    public List<Product> getAllProducts(){
        return products;
    }
    public void createProduct(Product product){
        products.add(product);
    }

    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    public void updateProduct(Product product) throws ProductNotFound, ProductNotValid {
        if (product.getName().equals("")){
            throw new ProductNotValid ("Product Not Valid!");
        }
        int counter = 0;
        for (Product item: products){
            if (item.getID() == product.getID()) {
                item.name = product.name;
                counter++;
            }

        }
        if (counter == 0){
            throw new ProductNotFound ("Product Not Found!");
        }
    }

    public void deleteProduct(int id) throws ProductNotFound{
        int counter = 0;
        for (Product item: products){
            if (item.getID() == id) {
                products.remove(item);
                counter++;
            }
        }
        if (counter == 0){
            throw new ProductNotFound ("Product Not Found!");
        }
    }

}
