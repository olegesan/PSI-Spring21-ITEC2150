package Session5_midterm.StartHere.PetTask;

/**
 * represents a dog
 * @author olegesan
 */
public class Dog extends Pet {
    private int dogYears;
    private String breed;

    public Dog(String nickname, String ownerName, String breed, int age) {
        super(nickname, ownerName, age);
        this.dogYears = calculateDogYears(age);
        this.breed = breed;
    }

    /**
     * provides dog's age based on human years.
     * Purpose to map human years to dog years and get equivalent of human age
     * first human year for a dog is equal to 15 years
     * second human year for a dog is equal to 9 years
     * every next year is about 4-5 dor a dog. For the purpose of this method I counted them as 5.
     *
     * @param age in human years
     * @return age in dog years.
     */
    public int calculateDogYears(int age) {
        int dogYears = 0;
        for (int i = age; i > 0; i--) {
            if (i == 1) {
                dogYears += 15;
            } else if (i == 2) {
                dogYears += 9;
            } else {
                dogYears += 5;
            }
        }
        return dogYears;
    }

    @Override
    public void voice() {
        System.out.println(getName() + " says, 'woof, woof'");
    }

    public int getDogYears() {
        return dogYears;
    }

    public void setDogYears(int dogYears) {
        this.dogYears = dogYears;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {

        return "Dog{" +
                "name='" + super.getName() +
                "', ownerName='" + getOwnerName() +
                "', age=" + getAge() +
                ", dogYears=" + dogYears +
                ", breed='" + breed + '\'' +
                '}';
    }
}
