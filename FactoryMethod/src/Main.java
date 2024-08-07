
public class Main {
    public static void main(String[] args) {
//        The Factory Method pattern addresses a common problem in software design:
//        how to create objects without specifying the exact class of object that will be created.
//        This may seem like a trivial issue, but it becomes significant when dealing with complex systems.

        CharacterFactory factory;

        // Create a Warrior
        factory = new WarriorFactory();
        Character warrior = factory.createCharacter();
        warrior.attack();

        // Create a Mage
        factory = new MageFactory();
        Character mage = factory.createCharacter();
        mage.attack();

        // Create an Archer
        factory = new ArcherFactory();
        Character archer = factory.createCharacter();
        archer.attack();
    }
}