package lesson3;

public class MainClass {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        Product product1 = new Product(54554, "Nosok", 21234, 11);
        Product product2 = new Product(5454, "Nosok2", 124, 131);
        Product product3 = new Product(54554, "Nosok3", 24, 4);

        catalog.addProduct(product1);
        catalog.addProduct(product2);
        catalog.addProduct(product3);

        try{
            catalog.updateProduct(product3);
        }
        catch (ProductNotFound e){
            System.out.println("ProductNotFound");
        }
        catch (ProductNotValid e){
            System.out.println("ProductNotValid");
        }

        try{
            catalog.deleteProduct(5454);
        }
        catch (ProductNotFound e){
            System.out.println("ProductNotFound");
        }



    }
}
