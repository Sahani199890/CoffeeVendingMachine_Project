package coffee;

import ingredient.CheckIngredients;
import ingredient.DeleteIngredients;

public class Cappuccino implements ICoffee{

    CheckIngredients checkIngredient=new CheckIngredients();
    DeleteIngredients deleteIngredient=new DeleteIngredients();
    @Override
    public void buy(){
        if(checkIngredient.checkIngredients(2f,1f,12f)){
            deleteIngredient.deleteIngredients(2f,1f,12f);
            System.out.println("Your cappuccino is ready");
            System.out.println("Your bill is -> $"+6);
            Price.setPrice(Price.getPrice()+6);
            Price.cappuccinoCount++;
        }
        else{
            System.out.println("Error Error Ingredients Insufficient for making Cappuccino, Contact Owner");
        }
    }
}
