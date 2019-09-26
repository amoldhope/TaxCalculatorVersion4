package main.java;

import main.java.Food.*;
import main.java.Furniture.*;
import main.java.Electronics.*;


public class Main {


    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.AddItem(new Food(Foods.BISCUITS));
        cart.AddItem(new Furniture(Furnitures.BED));
        cart.AddItem(new Food(Foods.BISCUITS));
        TaxCalculator t = new TaxCalculator();
        System.out.println(t.calculate(Cart.items));
    }
}
