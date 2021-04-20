package Session13.StartCode;

/**
 * Basketbal Player class represents a team player in basketball
 */
public class BasketballPlayer {

    private int allStarGamesPlayer;

    public BasketballPlayer(String name,

                            String position,
                            Team<BasketballPlayer> team,
                            int playerNumber,
                            int magicKPI,
                            int allStarGamesPlayer) {
        super(name, "basketball", position, team, playerNumber);
        this.allStarGamesPlayer = allStarGamesPlayer;
        computeMagicKPI(magicKPI);
    }

    public BasketballPlayer(String name,
                            int age,
                            String position,
                            Team<BasketballPlayer> team,
                            int playerNumber,
                            int magicKPI,
                            int allStarGamesPlayer) {
        super(name, "basketball", age, position, team, playerNumber);
        this.allStarGamesPlayer = allStarGamesPlayer;
        computeMagicKPI(magicKPI);
    }

    /**
     * Unique way for a basketball player to calculate their performance
     * this is a dummy value
     * @param initialValue
     */
    @Override
    public void computeMagicKPI(int initialValue) {
        int rand = (int) (Math.random()*79);
        setMagicKPI((64-getAge()+rand));
    }

    // implement method play that prints out something about baskeball player

}
