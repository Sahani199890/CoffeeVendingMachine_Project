package ingredient;

import java.util.Scanner;

public class AddIngredients {
    Ingredient ingredient=new Ingredient();

    public void addIngredient() {
        System.out.println("Successfully accessed vending machine box and Ingredients were added you can now order coffee");
        float val1 = 5000f - ingredient.getWater();
        float val2 = 2000f - ingredient.getMilk();
        float val4 = 400f - ingredient.getBeans();

        ingredient.setWater(ingredient.getWater() + val1);
        ingredient.setMilk(ingredient.getMilk() + val2);
        ingredient.setBeans(ingredient.getBeans() + val4);
    }
}
