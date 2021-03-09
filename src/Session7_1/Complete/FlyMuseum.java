package Session7_1.Complete;

import java.util.ArrayList;
import java.util.List;

public class FlyMuseum {
    private List<CanFly> museum;
    public FlyMuseum(){
        museum = new ArrayList<>();
    }

    public void addToMuseum(CanFly flyingObject){
        museum.add(flyingObject);
    }

    public List<CanFly> getMuseum(){
        return museum;
    }
}
