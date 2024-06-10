public class SingletonDemo {
        public static void main(String[] args) {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);

            Singleton anotherSingleton = Singleton.getInstance();
            System.out.println(anotherSingleton);

            if (singleton == anotherSingleton)
                System.out.println("Both references point to the same instance.");
            else
                System.out.println("Different instances exist.");

            SingleTonSimplerApproach singletonNew = SingleTonSimplerApproach.getInstance();
            System.out.println("new singleton "+singletonNew.hashCode());
            SingleTonSimplerApproach Newsingleton = SingleTonSimplerApproach.getInstance();
            System.out.println("new singleton 0 "+ Newsingleton.hashCode());

    }
}
