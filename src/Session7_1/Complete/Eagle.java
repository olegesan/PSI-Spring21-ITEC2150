package Session7_1.Complete;

public class Eagle extends Bird implements CanFly {

    public Eagle(String kind, boolean isFemale) {
        super(kind, isFemale);
    }

    public void soar(){
        System.out.println("the eagle soars in the sky.");
    }

    public void fly(){
        System.out.println("the eagle flaps its wings and takes off in the sky.");
    }
}
