package coffee;

import java.util.Scanner;

public class Price {
    private static float price;
    static int cappuccinoCount;
    static int espressoCount;
    static int latteCount;

    public static float getPrice() {
        return price;
    }

    public static void setPrice(float price) {
        Price.price = price;
    }
    static Scanner sc=new Scanner(System.in);
    public static void take(){
       boolean flag=true;
       for(int i=3;i>0;i--){
           System.out.println("Please enter your pin to unlock money box");
           int pin=sc.nextInt();
           if(pin==123456) {
               System.out.println(getPrice());
               setPrice(0f);
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
    public static void listOfItemsSold(){
        boolean flag=true;
        for(int i=3;i>0;i--) {
            System.out.println("Please enter your pin to see list of items sold");
            int pin = sc.nextInt();
            if (pin == 123456) {
                System.out.println("Cappuccino cups sold" + cappuccinoCount);
                System.out.println("Latte cups sold" + latteCount);
                System.out.println("Espresso cups sold" + espressoCount);
                flag = false;

                if (!flag) {
                    break;
                } else {
                    System.out.println("Your pin is wrong you have more" + (i - 1) + "attempts");
                }
            }
        }
        if(flag) {
            System.out.println("Machine locked open with key not with pin ");
            System.exit(0);
        }
    }
}
