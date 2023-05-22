package lecture.designPatterns.decorator.pizza;

public class Tomato implements Pizza{
    Pizza pizza;

    public Tomato(Pizza pizza) {
        if (pizza == null) {
            throw new IllegalStateException("Invalid state: Add a base before adding toppings");
        }
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Tomato";
    }
}
