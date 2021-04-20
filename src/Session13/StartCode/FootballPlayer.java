package Session13.StartCode;

/**
 * Football Player class represents a team player in football
 */
public class FootballPlayer {
    private int superBowlGamesPlayed;

    public FootballPlayer(String name,
                          String sport,
                          String position,
                          Team<FootballPlayer> team,
                          int playerNumber,
                          int magicKPI,
                          int superBowlGamesPlayed) {
        super(name, sport, position, team, playerNumber);
        this.superBowlGamesPlayed = superBowlGamesPlayed;
        computeMagicKPI(magicKPI);
    }

    public FootballPlayer(String name,
                          String sport,
                          int age,
                          String position,
                          Team<FootballPlayer> team,
                          int playerNumber,
                          int footbalMagicKPI,
                          int superBowlGamesPlayed) {
        super(name, sport, age, position, team, playerNumber);
        computeMagicKPI( footbalMagicKPI);
        this.superBowlGamesPlayed = superBowlGamesPlayed;
    }

    /**
     * a unique way to compute football player perfomance
     * @param initialValue
     */
    @Override
    public void computeMagicKPI(int initialValue) {
        int rand = (int) (Math.random() * 100);
        setMagicKPI(initialValue - super.getAge() + super.getPlayerNumber()* rand);
    }


    public int getSuperBowlGamesPlayed() {
        return superBowlGamesPlayed;
    }

    public void setSuperBowlGamesPlayed(int superBowlGamesPlayed) {
        this.superBowlGamesPlayed = superBowlGamesPlayed;
    }

    @Override
    public void play() {
        if(super.getPosition().equals("quarterback")){
            System.out.println(super.getName()+" doges and passes to touchdown.");
        }else if(super.getPosition().equals("receiver")){
            System.out.println(super.getName()+" jumps high, receives, and scores a touchdown.");
        }
        else {
            System.out.println(super.getName()+ " roars, tackles, smashes, and gets a flag.");
        }
    }
}
