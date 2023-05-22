package lecture.designPatterns.decorator.pizza;

public class Paneer implements Pizza{
    Pizza pizza;

    public Paneer(Pizza pizza) {
        if (pizza == null) {
            throw new IllegalStateException("Invalid state: Add a base before adding toppings");
        }
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 60;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Paneer";
    }
}
