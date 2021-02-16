package Session4.StartHere;

public class App {

    private String name;
    private String developer;
    private double sizeMB;

    public App(String name, String developer, double size) {
        this.name = name;
        this.developer = developer;
        this.sizeMB = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public double getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(double sizeMB) {
        this.sizeMB = sizeMB;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", sizeMB=" + sizeMB +
                '}';
    }
}
