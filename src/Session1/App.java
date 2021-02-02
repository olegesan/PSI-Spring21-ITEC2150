package Session1;

public class App {

    private String name;
    public App(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "App " +
                "name='" + name + '\'';
    }
}
