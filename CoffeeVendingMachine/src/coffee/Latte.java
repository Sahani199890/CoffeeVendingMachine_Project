package coffee;

import ingredient.CheckIngredients;
import ingredient.DeleteIngredients;

public class Latte implements ICoffee{
    CheckIngredients checkIngredient=new CheckIngredients();
    DeleteIngredients deleteIngredient=new DeleteIngredients();
    @Override
    public void buy(){
        if(checkIngredient.checkIngredients(3.5f,7.5f,20f)){
            deleteIngredient.deleteIngredients(3.5f,7.5f,20f);
            System.out.println("Your Latte is ready");
            System.out.println("Your bill is -> $"+7);
            Price.setPrice(Price.getPrice()+7);
            Price.latteCount++;
        }
        else{
            System.out.println("Error Error Ingredients Insufficient for making Latte, Contact Owner");
        }
    }
}
