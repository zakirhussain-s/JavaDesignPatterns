public class SingleTonSimplerApproach {
//     The constructor remains private to prevent external instantiation.
    private SingleTonSimplerApproach(){}
//A static inner class SingletonHolder is created.
    private static class SingletonHolder{
//        Inside SingletonHolder, a static final instance of Singleton is created (INSTANCE).
        private static final SingleTonSimplerApproach INSTANCE = new SingleTonSimplerApproach();
    }

//     This method simply returns the INSTANCE from the SingletonHolder class.
    public static SingleTonSimplerApproach getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
