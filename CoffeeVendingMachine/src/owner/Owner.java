package owner;

import coffee.Price;
import ingredient.AddIngredients;
import ingredient.CheckIngredients;

import java.util.Scanner;

public class Owner {
    public void ownerCheck(){
        AddIngredients addIngredients=new AddIngredients();
        CheckIngredients checkIngredients=new CheckIngredients();
        boolean flag=true;
        for(int i=3;i>0;i--) {
            System.out.println("Please enter your pin to unlock Vending Machine box");
            int pin = new Scanner(System.in).nextInt();
            if (pin == 123456) {
                System.out.println("Enter select for \n 1.To Add Ingredients \n 2.Take Amount from Money Box \n " +
                        "3.To Check List of Items Sold \n 4.To check Ingredients left in the storage");
                switch (new Scanner(System.in).nextInt()) {
                    case 1 -> addIngredients.addIngredient();
                    case 2 -> Price.take();
                    case 3 -> Price.listOfItemsSold();
                    case 4 -> checkIngredients.seeIngredients();
                    default -> System.out.println("Please enter valid input");
                }
                flag=false;
            }
            if(!flag){
                break;
            }
            else {
                System.out.println("Your pin is wrong you have more" + (i-1) + "attempts");
            }
        }
        if(flag) {
            System.out.println("Machine locked open with key not with pin ");
            System.exit(0);
        }
    }
}
