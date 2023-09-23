package org.example;

import java.sql.SQLSyntaxErrorException;

public class StaticMethodsDemo {
    public static void main(String[] args){
        Sale.announcement();
        DiscountSale.announcement();
        System.out.println("That showed that you override a static method + definition.");
        Sale s = new Sale();
        DiscountSale discount = new DiscountSale();
        s.announcement();
        discount.announcement();
        System.out.println("No surprise so far, but wait!");
        Sale discount2 = discount;
        System.out.println("discount2 is a DiscountSale object in a Sale variable.");
        System.out.println("Which definition of announcement() will it use?");
        discount2.announcement();
        System.out.println("It uses the Sales version of announcement()!");
//checking if down casting is legitimate
        Sale saleVariable = new Sale("paint", 15);
        DiscountSale ds = new DiscountSale();
        if (saleVariable instanceof DiscountSale){
            ds = (DiscountSale) saleVariable;
            System.out.println("ds was changed to " + saleVariable);
        } else {
            System.out.println("ds was not changed.");
        }
        //self test exercise5
        Sale SalesVariable1;
        DiscountSale discountVariable = new DiscountSale("paint", 15, 10);
        saleVariable = (Sale) discountVariable;
        System.out.println(saleVariable.toString());

        //self test exercise 7
        Sale someObject2 = new DiscountSale("map", 5, 0);
        DiscountSale ds2 = new DiscountSale();
        System.out.println(someObject2);
        if (someObject2 instanceof DiscountSale){
            ds2 = (DiscountSale) someObject2;
            System.out.println("ds2 was changed to "+ someObject2);
        } else {
            System.out.println("ds2 was not changed.");
        }

        // Self test exercise 8
        Sale someObject3 = new Sale("map", 5);
        DiscountSale ds3 = new DiscountSale();
        if (someObject3 instanceof  DiscountSale){
            ds3 = (DiscountSale) someObject3;
            System.out.println("ds3 was changed to " +someObject3);
        } else {
            System.out.println("ds3 was not changed.");
        }

    }
}
