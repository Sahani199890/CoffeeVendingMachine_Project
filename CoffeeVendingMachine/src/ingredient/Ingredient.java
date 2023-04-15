package ingredient;


public class Ingredient {
    private static float water;
    private static float milk;
    private static float beans;

    public Ingredient() {
    }

    public float getWater() {
        return water;
    }

    public float getMilk() {
        return milk;
    }

    public float getBeans() {
        return beans;
    }

    public void setWater(float water) {
        Ingredient.water = water;
    }

    public void setMilk(float milk) {
        Ingredient.milk = milk;
    }


    public void setBeans(float beans) {
        Ingredient.beans = beans;
    }

    public void show(){
        System.out.println("water -> "+water+"\n"+"milk -> "+milk+"\n"+"beans -> "+beans);
    }
}
