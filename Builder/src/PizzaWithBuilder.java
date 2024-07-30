import java.util.List;

public class PizzaWithBuilder {
    private String size;
    private String crust;
    private List<String> toppings;

    public PizzaWithBuilder(PizzaBuilder builder){
        this.size = builder.size;
        this.crust = builder.crust;
        this.toppings = builder.toppings;
    }

    public static class PizzaBuilder{
        private String size;
        private String crust;
        private List<String> toppings;

        public PizzaBuilder setSize(String size){
            this.size = size;
            return this;
        }
        public PizzaBuilder setCrust(String crust){
            this.crust = crust;
            return this;
        }
        public PizzaBuilder setToppings(List<String> toppings){
            this.toppings = toppings;
            return this;
        }

        public PizzaWithBuilder build(){
            return new PizzaWithBuilder(this);
        }
    }
}
