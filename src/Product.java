public class Product {
    private String name;
    private String description;
    private double price;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

interface ProductInterface{
    public static void calculate(){
        System.out.println("Hesaplandı");
    };
}