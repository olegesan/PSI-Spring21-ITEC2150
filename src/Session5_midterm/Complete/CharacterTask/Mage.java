package Session5_midterm.Complete.CharacterTask;

/**
 * Represents a Mage in an Anime
 */
public class Mage extends AnimeCharacter {
    private int mana;
    private String superAttackName;

    public Mage(String name, int healthPoints, int stamina, int mana, String superAttackName) {
        super(name, healthPoints, stamina);
        this.mana = mana;
        this.superAttackName = superAttackName;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getSuperAttackName() {
        return superAttackName;
    }

    public void setSuperAttackName(String superAttackName) {
        this.superAttackName = superAttackName;
    }

    /**
     * Mage attack that executes super attack and drains 5 stamina points
     *
     * @return true if attack can be executed, false otherwise
     */
    @Override
    public boolean attack() {
        if (super.getStamina() > 5) {
            System.out.println(getName() + " executes " + superAttackName);
            setStamina(getStamina() - 5);
            return true;
        } else {
            return super.attack();
        }
    }

    @Override
    public String toString() {
        return "Mage{" +
                "mana=" + mana +
                ", superAttackName='" + superAttackName + '\'' +
                "} " + super.toString();
    }
}
