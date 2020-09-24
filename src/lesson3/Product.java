package lesson3;

public class Product {
    final long id;
    protected int price;
    protected String name;
    protected int number;

    public Product(long id, String name, int price, int number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public int getPrice(){
        return price;
    }

    public int getNumber(){
        return number;
    }

    public long getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printInfo() {
        System.out.println("ИД: " + id +
                ", цена: " + price + "р." +
                ", название: "+ name +
                ", количество: " + number);
    }

}

