public class Singleton {

    // Step 1: Create a private static variable to hold the single instance of the class
    // assigning Null will give room for lazy loading
    private static volatile Singleton instance = null;

    // Step 2: Make the constructor private so no one can instantiate the class
    private Singleton(){
//        to avoid reflection
        if (instance != null)
            throw new RuntimeException("use getInstance() method to create");
    }

    // Step 3: Provide a public static method to get the instance of the class
    public static Singleton getInstance(){
//        loads the instance only once, this will fetch only when needed and once
//        we use double lock check
        if (instance == null) {
//      if i use only single null check then multiple threads can access it
//      if i use then synchronized ensures only one thread can enter the block at a time, guaranteeing a single instance.
            synchronized (Singleton.class){
                if(instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
