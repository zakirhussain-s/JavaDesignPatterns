public class DeepEngine implements Cloneable{
    public int horsePower;

    public DeepEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public DeepEngine clone(){
        try{
            return (DeepEngine) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Engine [horsepower=" + horsePower + "]";
    }
}
