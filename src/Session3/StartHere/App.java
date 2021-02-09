package Session3.StartHere;

public class App {

    private String name;
    //TODO: add size and developer attributes

    //TODO: update @App constructor to use new attributes
    public App(String name) {
        this.name = name;
    }

    //TODO: update @toString method to depict new attributes
    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                '}';
    }
}
