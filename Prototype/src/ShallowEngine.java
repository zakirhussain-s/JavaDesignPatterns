public class ShallowEngine {
    public int horsePower;

    public ShallowEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine [horsepower=" + horsePower + "]";
    }
}
