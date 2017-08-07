package pl.sda.day8.zad2;

import java.util.HashSet;

/**
 * Created by RENT on 2017-07-06.
 */
public class Meal {
    private HashSet<Ingredient> meal = new HashSet<>();

    public void addIngredient(Ingredient ingredient) {
        meal.add((ingredient));
    }

    public void removeIngredient(Ingredient ingredient) {
        meal.remove(ingredient);
    }


    public void printIngredient() {
        for (Ingredient ingredient : meal) {
            System.out.println(ingredient);
        }

    }

    public HashSet<Ingredient> getIngredients() {
        return meal;
    }
}
