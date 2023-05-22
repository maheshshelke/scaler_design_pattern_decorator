package lecture.designPatterns.decorator.pizza;

public class Cheese implements Pizza{
    Pizza pizza;

    public Cheese(Pizza pizza) {
        if (pizza == null) {
            throw new IllegalStateException("Invalid state: Add a base before adding toppings");
        }
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Cheese";
    }
}
