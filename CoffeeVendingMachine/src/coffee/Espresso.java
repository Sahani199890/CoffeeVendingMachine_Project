package coffee;

import ingredient.CheckIngredients;
import ingredient.DeleteIngredients;

public class Espresso implements ICoffee {
    CheckIngredients checkIngredient=new CheckIngredients();
    DeleteIngredients deleteIngredient=new DeleteIngredients();
    @Override
    public void buy(){
        if(checkIngredient.checkIngredients(2.5f,0f,16f)){
            deleteIngredient.deleteIngredients(2.5f,0f,16f);
            System.out.println("Your Espresso is ready");
            System.out.println("Your bill is -> $"+4);
            Price.setPrice(Price.getPrice()+4);
            Price.espressoCount++;
        }
        else{
            System.out.println("Error Error Ingredients Insufficient for making Espresso, Contact Owner");
        }
    }
}
