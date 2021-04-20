package Session13.StartCode;

public abstract class  TeamPlayer <T extends TeamPlayer<T>> extends Athlete{
    private String position;
    private Team<T> team;
    private int playerNumber;
    private int magicKPI;

    public TeamPlayer(String name, String sport, String position, Team<T> team, int playerNumber) {
        super(name, sport);
        this.position = position;
        this.team = team;
        this.playerNumber = playerNumber;
    }

    public TeamPlayer(String name, String sport, int age, String position, Team<T> team, int playerNumber) {
        super(name, sport, age);
        this.position = position;
        this.team = team;
        this.playerNumber = playerNumber;
    }

    public  int getMagicKPI() {
        return magicKPI;
    }

    protected void setMagicKPI(int magicKPI) {
        this.magicKPI = magicKPI;
    }

    public abstract void computeMagicKPI(int magicKPI);

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team<T> getTeam() {
        return team;
    }

    public void setTeam(Team<T> team) {
        this.team = team;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
    public abstract void play();
}
