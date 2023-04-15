package ingredient;

import java.util.Scanner;

public class DeleteIngredients {
    Ingredient ingredient=new Ingredient();
    public void deleteIngredients(float waterQ,float milkQ,float beansQ){
        ingredient.setWater(ingredient.getWater()-waterQ);
        ingredient.setMilk(ingredient.getMilk()-milkQ);
        ingredient.setBeans(ingredient.getBeans()-beansQ);

    }
}
