// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
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