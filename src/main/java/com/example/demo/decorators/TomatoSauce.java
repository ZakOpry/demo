package com.example.demo.decorators;

public class TomatoSauce extends ToppingDecorator{

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");

    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Tomato";
    }

    public double getCost(){
        return tempPizza.getCost() + .35;
    }
}
