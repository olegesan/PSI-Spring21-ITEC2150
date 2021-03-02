package Session5_midterm.Complete.CharacterTask;

public class CharacterTester {
    public static void main(String[] args) {

        AnimeCharacter yuno = new Mage("Yuno", 100, 100, 100, "Wind Blades");
        AnimeCharacter asta = new Commoner("Asta" , 100, 1000, "Pop potatoes");
        yuno.attack();
        asta.attack();
        System.out.println(yuno);
        System.out.println(asta);
    }
}
