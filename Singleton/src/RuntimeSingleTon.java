public class RuntimeSingleTon {
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();

        System.out.println(singletonRuntime);

        Runtime anotherSingletonRuntime = Runtime.getRuntime();
        System.out.println(anotherSingletonRuntime);

        if (singletonRuntime == anotherSingletonRuntime)
            System.out.println("we are same instances");
    }
}