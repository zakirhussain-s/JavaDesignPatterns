import java.util.List;

public class PizzaWithoutBuilder {
    private String size;
    private String crust;
    private List<String> toppings;

    public PizzaWithoutBuilder(String size,String crust, List<String> toppings){
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
    }
}
