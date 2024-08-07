public class Main {
    public static void main(String[] args) {

//        The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
//        It’s like a factory of factories.
//        Why is it Important?
//      Family of Products: When you need to create groups of related objects (e.g., different types of UI elements for different operating systems).
//      Consistency:Ensures that the related objects are compatible with each other.
//      Decoupling: Decouples the client code from the specific classes of products it uses.

        GUIFactory factory;

        String os = "Mac";

        if(os.equals("Windows"))
            factory = new WindowsFactory();
        else
            factory = new MacOSFactory();

        Application app = new Application(factory);
        app.paint();
    }
}