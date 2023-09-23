package org.example;

public class DiscountSale extends Sale{
    private double discount;

    public DiscountSale(){
        super();
        discount = 0;
    }
    public DiscountSale(String theName, double thePrice, double theDiscount){
        super(theName, thePrice);
        setDiscount(theDiscount);
    }
    public DiscountSale(DiscountSale originalObject){
        super(originalObject);
        discount = originalObject.discount;
    }
    public static void announcement(){
        System.out.println("This is the DiscountSale class.");
    }
    public double bill(){
        double fraction = discount/100;
        return (1 - fraction)*getPrice();
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double newDiscount){
        if(newDiscount >= 0){
            discount = newDiscount;
        } else {
            System.out.println("Error: Negative discount.");
        }
    }
    public String toString(){
        return (
                getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + " Total cost = $" + bill()
                );
    }
    public DiscountSale clone(){
        return new DiscountSale(this);
    }

    // clone method practise
    public static Sale[] goodCopy(Sale[] args){
        Sale[] b = new Sale[args.length];
        for (int i = 0; i < args.length; i++){
            b[i] = args[i].clone();
        }
        return b;
    }

    public static Sale[] badCopy(Sale[] a){
        Sale[] b = new Sale[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = new Sale(a[i]);
        return b;
    }

}
