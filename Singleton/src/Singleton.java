public class Singleton {

    // Step 1: Create a private static variable to hold the single instance of the class
    private static Singleton instance = new Singleton();

    // Step 2: Make the constructor private so no one can instantiate the class
    private Singleton(){}

    // Step 3: Provide a public static method to get the instance of the class
    public static Singleton getInstance(){
        return instance;
    }
}
