package lesson3;

public class ProductAlreadyExists extends Exception {
    public ProductAlreadyExists (String message){
        super(message);
    }
}
