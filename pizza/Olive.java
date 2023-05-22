package lecture.designPatterns.decorator.pizza;

import lecture.designPatterns.decorator.icecream.Icecream;

public class Olive implements Pizza{

    Pizza pizza;

    public Olive(Pizza pizza) {
        if (pizza == null) {
            throw new IllegalStateException("Invalid state: Add a base before adding toppings");
        }
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        if(pizza == null)
            return 20;
        return pizza.getCost() + 20;
    }

    @Override
    public String getDescription() {
        if(pizza == null)
            return "Olive";
        return pizza.getDescription() + " + Olive";
    }
}
