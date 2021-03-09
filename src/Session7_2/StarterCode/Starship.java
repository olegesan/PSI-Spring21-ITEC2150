package Session7_2.StarterCode;

public class Starship {
    private IEngine engine;
    private int crewNum ;
    private int weight;

    public Starship(IEngine engine, int crewNum, int weight) {
        this.engine = engine;
        this.crewNum = crewNum;
        this.weight = engine.getWeight() + weight + crewNum * 85;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public int getCrewNum() {
        return crewNum;
    }

    public void setCrewNum(int crewNum) {
        this.crewNum = crewNum;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
