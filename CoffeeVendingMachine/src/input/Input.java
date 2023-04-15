package input;

import coffee.Cappuccino;
import coffee.Espresso;
import coffee.Latte;
import coffee.Price;
import ingredient.AddIngredients;
import owner.Owner;

import java.util.Scanner;

public class Input {
    public static void giveInput(){
        Latte latte=new Latte();
        Espresso espresso=new Espresso();
        Cappuccino cappuccino=new Cappuccino();
        Owner owner=new Owner();

        System.out.println("Select \n 1.Latte \n 2.Espresso \n 3.Cappuccino \n 4.Stop \n 5.Owner works");
        System.out.println("Please enter your input");
        Scanner sc=new Scanner(System.in);

        for(int i=0;;i++){
            switch (sc.nextInt()) {
                case 1 -> latte.buy();
                case 2 -> espresso.buy();
                case 3 -> cappuccino.buy();
                case 4 -> System.exit(0);
                case 5 -> owner.ownerCheck();
                default -> System.out.println("please provide correct input");
            }
        }
    }
}
