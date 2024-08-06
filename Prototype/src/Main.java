
public class Main {
    public static void main(String[] args) {
//      what is Protoype pattern?
//      The Prototype design pattern is another creational pattern that helps in the creation of objects.
//      It allows you to create a new object by copying an existing object, known as the prototype.

//      prototype mean: duplicating exisiting object to have no dependence on other classes

        System.out.printf("Shallow Cloning here");

        ShallowEngine shallowEngine = new ShallowEngine(500);
        ShallowCloningCar originalCar = new ShallowCloningCar("Kia","Olive",2024, shallowEngine);
        ShallowCloningCar clonedCar = originalCar.clone();

        System.out.println("Original Car: " + originalCar);
        System.out.println("Cloned Car: " + clonedCar);

        clonedCar.shallowEngine.horsePower = 600;
        System.out.println("After modifying cloned car's engine:");
        System.out.println("Original Car: " + originalCar);
        System.out.println("Cloned Car: " + clonedCar);

//     Deep cloning creates a new object and also recursively creates copies of all objects referenced by the original object.
//     This means the cloned object and the original object do not share references to the same objects;
//     instead, each object in the original object graph is copied.
        System.out.printf("\n");
        System.out.printf("\n");

        System.out.printf("Deep Cloning here");

        DeepEngine deepEngine = new DeepEngine(500);
        DeepCloningCar originalDeepCar = new DeepCloningCar("Kia","Olive",2024,deepEngine);
        DeepCloningCar clonedDeepCar = originalDeepCar.clone();

        System.out.println("Original Car: " + originalDeepCar);
        System.out.println("Cloned Car: " + clonedDeepCar);

        clonedDeepCar.deepEngine.horsePower = 600;
        System.out.println("After modifying cloned car's engine:");
        System.out.println("Original Car: " + originalDeepCar);
        System.out.println("Cloned Car: " + clonedDeepCar);
    }
}