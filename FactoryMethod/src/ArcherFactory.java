public class ArcherFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Archer();
    }
}
