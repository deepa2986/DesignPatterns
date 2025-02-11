package creational.prototype;

public  abstract class Meal {

    private int price;
    public Meal(int price){
        this.price = price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public abstract Meal clone();
}
