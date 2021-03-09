package Session7_1.Complete;

public class FlyTest {
    public static void main(String[] args) {

        FlyMuseum museum = new FlyMuseum();
        Eagle eagle = new Eagle("eagle", false);
        Penguin penguin = new Penguin("penguin", true);
        Airplane ariplane = new Airplane();
        museum.addToMuseum(eagle);
        museum.addToMuseum(ariplane);

        for (CanFly object : museum.getMuseum()){
            object.fly();
        }



    }
}
