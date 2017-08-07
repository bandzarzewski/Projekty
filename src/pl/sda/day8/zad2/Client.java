package pl.sda.day8.zad2;

import java.util.HashSet;

/**
 * Created by RENT on 2017-07-06.
 */
public class Client {
    private HashSet<Ingredient> allergies = new HashSet<>();

    // w tej metodzie dodajemy do zbioru HashSet "allergies" nowe "allergen".

    public void addAllegry(Ingredient allergen) {
        allergies.add(allergen);
    }

    public boolean isDead(Meal meal) {
        for (Ingredient allergen : allergies) {
            if (meal.getIngredients().contains(allergen)) {
                return true;
            }
        }
        return false;
    }

}
