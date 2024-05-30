public class Singleton {

    // Step 1: Create a private static variable to hold the single instance of the class
    // assiging Null will give room for lazy loading
    private static Singleton instance = null;

    // Step 2: Make the constructor private so no one can instantiate the class
    private Singleton(){}

    // Step 3: Provide a public static method to get the instance of the class
    public static Singleton getInstance(){
//        loads the instance only once, this will fetch only when needed and once
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
