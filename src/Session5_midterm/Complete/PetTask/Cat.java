package Session5_midterm.Complete.PetTask;

/**
 * Represents a cat
 * This class inherits from Pet class
 */
public class Cat extends Pet {
    private int catAge;
    private String breed;

    public Cat(String name, String ownerName, String breed, int age) {
        super(name, ownerName, age);
        this.breed = breed;
        this.catAge = calculateCatYears(age);
    }

    private int calculateCatYears(int age) {
        return age*12;
    }
    @Override
    public void voice(){
        System.out.println("meow, meow");
    }

    @Override
    public String toString() {

        return "Cat{" +
                "name='" + super.getName() +
                "', ownerName='" + getOwnerName() +
                "', age=" + getAge() +
                ", catYears=" + catAge +
                ", breed='" + breed + '\'' +
                '}';
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int age) {
        this.catAge = calculateCatYears(age);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
