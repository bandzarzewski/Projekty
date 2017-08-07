package pl.sda.day8.zad2;

/**
 * Created by RENT on 2017-07-06.
 */
public class Main {
    public static void main(String[] args) {
        Ingredient cheese = new Ingredient("cheese");
        Ingredient tomato = new Ingredient("tomato");
        Ingredient bread = new Ingredient("bread");
        Ingredient egg = new Ingredient("egg");

        Meal sandwich = new Meal();

        sandwich.addIngredient(cheese);
        sandwich.addIngredient(tomato);
        sandwich.addIngredient(bread);
        sandwich.addIngredient(egg);

        sandwich.printIngredient();

        Client peter = new Client();
        peter.addAllegry(tomato);

        System.out.println(" On umrze : " + peter.isDead(sandwich));
    }
}
