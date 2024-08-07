public class ShallowCloningCar implements Cloneable{
    private String model;
    private String color;
    private int year;
    ShallowEngine shallowEngine;

    public ShallowCloningCar(String model, String color, int year, ShallowEngine shallowEngine){
        this.model = model;
        this.color = color;
        this.year = year;
        this.shallowEngine = shallowEngine;
    }

    @Override
    public ShallowCloningCar clone(){
        try{
            return (ShallowCloningCar) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    @Override
    public String toString(){
        return "Car [model=" + model + ", color=" + color + ", year=" + year + ", engine=" + shallowEngine + "]";
    }
}

