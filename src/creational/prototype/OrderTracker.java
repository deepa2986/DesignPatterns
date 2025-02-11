package creational.prototype;

import java.util.List;

public class OrderTracker {

    public static void main(String[] args) {
        PizzaFlavour hawaiian = new PizzaFlavour("Hawaiian");

//        Pizza hawaiianPizza1 = new Pizza(4,hawaiian);
//        Pizza hawaiianPizza2 = new Pizza(4,hawaiian);
//        Pizza hawaiianPizza3 = new Pizza(4,hawaiian);
//        Pizza hawaiianPizza4 = new Pizza(4,hawaiian);
//        Pizza hawaiianPizza5 = new Pizza(4,hawaiian);

        Pizza hawaiianPizza1 = new Pizza(4,hawaiian);
        Pizza hawaiianPizza2 = hawaiianPizza1.clone();
        Pizza hawaiianPizza3 = hawaiianPizza1.clone();
        Pizza hawaiianPizza4 = hawaiianPizza1.clone();
        Pizza hawaiianPizza5 = hawaiianPizza1.clone();

        PizzaFlavour pepperoni = new PizzaFlavour("Pepperoni");

//        Pizza pepperoniPizza1 = new Pizza(5,pepperoni);
//        Pizza pepperoniPizza2 = new Pizza(5,pepperoni);
//        Pizza pepperoniPizza3 = new Pizza(5,pepperoni);
//        Pizza pepperoniPizza4 = new Pizza(5,pepperoni);
//        Pizza pepperoniPizza5 = new Pizza(5,pepperoni);

        hawaiian.setName("with extra cheese");

        Pizza pepperoniPizza1 = new Pizza(5,pepperoni);
        Pizza pepperoniPizza2 = pepperoniPizza1.clone();
        Pizza pepperoniPizza3 = pepperoniPizza1.clone();
        Pizza pepperoniPizza4 = pepperoniPizza1.clone();
        Pizza pepperoniPizza5 = pepperoniPizza1.clone();



        List<Meal> orders = List.of(hawaiianPizza1,hawaiianPizza2,hawaiianPizza3,hawaiianPizza4,hawaiianPizza5,
                pepperoniPizza1,pepperoniPizza2,pepperoniPizza3,pepperoniPizza4,pepperoniPizza5);
        placeOrder(orders);



    }

    public static void placeOrder(List<Meal> meals){
        System.out.println("order placed");
        meals.forEach(System.out::println);
    }
}
