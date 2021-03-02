package Session5_midterm.Complete.PetTask;

/**
 * Pet class to build upon more specific pet children classes.
 */
public class Pet {
    private String name;
    private String ownerName;
    private int age;

    public Pet(){
        name = "default pet name";
        ownerName = "default owner name";
        age = 0;
    }

    public Pet(String name, String ownerName, int age){
        this.age = age;
        this.name = name;
        this.ownerName = ownerName;
    }

    public void voice(){
        System.out.println(name + " makes a normal sound");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", age=" + age +
                '}';
    }
}
