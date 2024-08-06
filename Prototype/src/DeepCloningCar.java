public class DeepCloningCar implements Cloneable{
    private String model;
    private String color;
    private int year;
    DeepEngine deepEngine;

    public DeepCloningCar(String model, String color, int year, DeepEngine deepEngine){
        this.model = model;
        this.color = color;
        this.year = year;
        this.deepEngine = deepEngine;
    }

    @Override
    public DeepCloningCar clone(){
        try{
            DeepCloningCar cloningCar = (DeepCloningCar) super.clone();
            cloningCar.deepEngine = (DeepEngine) deepEngine.clone();
            return cloningCar;
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", color=" + color + ", year=" + year + ", engine=" + deepEngine + "]";
    }
}
