package org.example;

public class CopyingDemo extends Sale{
    public static void main(String[] args){
        Sale[] a = new Sale[2];
        a[0] = new Sale("atomic coffee mug" , 130000);
        a[1] = new DiscountSale("Invisible paint", 5, 10);
        int i;
        System.out.println("Bad Copy Started!");
        Sale[] b = badCopy(a);
        System.out.println("With copy constructor: ");
        for (i = 0; i < a.length; i ++){
            System.out.println("a[" + i + "] = " + a[i]);
            System.out.println("b[" + i + "] = " + b[i]);
            System.out.println("Bad Copy Ended!");
        }

        b = goodCopy(a);
        System.out.println("Good Copy Started");
        for (i = 0; i < a.length; i ++){
            System.out.println("a[" + i + "] = " + a[i]);
            System.out.println("b[" + i + "] = " + b[i]);
            System.out.println("Good Copy Ended!");
        }




    }
}
