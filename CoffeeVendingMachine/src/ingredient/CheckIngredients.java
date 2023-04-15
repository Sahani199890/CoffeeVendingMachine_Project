package ingredient;

public class CheckIngredients {
    Ingredient ingredient=new Ingredient();
    public boolean checkIngredients(float water,float milk,float beans){
        return ingredient.getWater() >= water && ingredient.getMilk() >= milk && ingredient.getBeans() >= beans;
    }
    public void seeIngredients(){
        System.out.println("Water in the storage -> "+ingredient.getWater()/1000+" ml out of 5 Liters");
        System.out.println("Milk in the storage -> "+ingredient.getMilk()/1000+" ml out of 2 Liters");
        System.out.println("Coffee Beans in the storage -> "+ingredient.getBeans()+" beans out of 400 beans");
        System.out.println("Thank you enter type of coffee needed");
    }
}
