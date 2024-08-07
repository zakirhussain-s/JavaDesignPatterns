import java.util.Arrays;
import java.util.List;

public class BuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("This is an example ");
        builder.append("of the builder pattern. ");
        builder.append("It has methods to append ");
        builder.append("almost anything we want to string ");
        builder.append(43);

        System.out.println(builder);

//        without builder, where we've to implicitly add values to constructor and all are mandatory
        PizzaWithoutBuilder pizzaWithoutBuilder = new PizzaWithoutBuilder("1","2", Arrays.asList("Cheese","Paneer"));

//        here the commented example we need to add all 3 params, else create new constructor with fewer params
//        PizzaWithoutBuilder pizzaWithoutBuilder1 = new PizzaWithoutBuilder("a");

//        with builder, we don't need all param we can define as many constructors we need also leaving some params constructor can be created
        PizzaWithBuilder pizzaWithBuilder = new PizzaWithBuilder.PizzaBuilder()
                .setSize("1")
                .setCrust("2")
                .setToppings(List.of("Cheese","Paneer"))
                .build();

        PizzaWithBuilder pizzaWithBuilder1 = new PizzaWithBuilder.PizzaBuilder()
                .setCrust("2")
                .build();

        PizzaWithBuilder pizzaWithBuilder2 = new PizzaWithBuilder.PizzaBuilder()
                .setSize("1")
                .build();

        PizzaWithBuilder pizzaWithBuilder3 = new PizzaWithBuilder.PizzaBuilder()
                .setCrust("22")
                .setToppings(List.of("Cheese","Paneer"))
                .build();

//        in the above example it is clear, we can create multiple constructors with Builder design Pattern to Avoid having multiple constructors
    }
}


