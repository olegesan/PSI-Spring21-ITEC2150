package Session5_midterm.Complete.CharacterTask;

/**
 * Represents a Commoner in an Anime
 */
public class Commoner extends AnimeCharacter {
    private String favoriteMeal;

    public Commoner(String name, int healthPoints, int stamina, String favoriteMeal) {
        super(name, healthPoints, stamina);
        this.favoriteMeal = favoriteMeal;
    }

    public String getFavoriteMeal() {
        return favoriteMeal;
    }

    public void setFavoriteMeal(String favoriteMeal) {
        this.favoriteMeal = favoriteMeal;
    }

    /**
     * Commoners don't like to fight, they eat.
     * Executes attack to actually offer some peace food.
     *
     * @return true if attack can be executed, false otherwise
     */
    @Override
    public boolean attack() {
        System.out.println(getName() + " offers some food. My favorite is " + favoriteMeal);
        return false;
    }

    @Override
    public String toString() {
        return "Commoner{" +
                "favoriteMeal='" + favoriteMeal + '\'' +
                "} " + super.toString();
    }
}
