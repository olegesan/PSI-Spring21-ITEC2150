package Session5_midterm.StartHere.CharacterTask;

public class AnimeCharacter {
    private String name;
    private int healthPoints;
    private int stamina;

    public AnimeCharacter(String name, int healthPoints, int stamina) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.stamina = stamina;
    }

    /**
     * Shows attack text
     * Also checks if a character can attack base on stamina
     * each attack drains stamina by 5 points
     * @return true if attack can be executed, false otherwise
     */
    public boolean attack(){
        if(stamina > 5 ){
            System.out.println(name+ " attacks, 'Bam, bam'");
            stamina-=5;
            return true;
        }else{
            System.out.println(name + " is too tired to attack. Get some pop potatoes to rejuvenate");
            return false;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "AnimeCharacter{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", stamina=" + stamina +
                '}';
    }
}
