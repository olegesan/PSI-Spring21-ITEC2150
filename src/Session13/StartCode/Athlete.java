package Session13.StartCode;

/**
 * Athlete class represents a general athlete
 * abstract
 * @author Oleg Bazylnikov
 * 04/20/21
 */
public abstract class Athlete {
    private String name;
    private String sport;
    private int age;

    public Athlete(String name, String sport){
        this.sport = sport;
        this.name = name;
    }

    public Athlete(String name, String sport, int age) {
        this.name = name;
        this.sport = sport;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: '" + name + '\'' +
                "\nSport: '" + sport + '\'' +
                "\nAge: " + age ;
    }
}
