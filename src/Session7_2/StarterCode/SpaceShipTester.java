//package Session7_2.StarterCode;
//
//public class SpaceShipTester {
//    public static void main(String[] args) {
//
//        IEngine doge = new DogeEngine();
//        IEngine dollar = new DollarEngine();
//
//        Starship st1 = new Starship(doge, 5, 1000);
//        Starship st2 = new Starship(dollar, 5, 1000);
//        long speed1 = maxSpeed( st1.getEngine().getPower(), st1.getWeight());
//        long speed2 = maxSpeed( st2.getEngine().getPower(), st2.getWeight());
//        System.out.println(speed1);
//        System.out.println(speed2);
//    }
//    public static long maxSpeed(long power, int mass){
//        return (long)((double)power/mass * 10) + 82;
//    }
//    public static void startMission(long speed, Starship starship){
//        if(speed >= 1000){
//            System.out.println("All systems ready. 3...2...1...");
//            starship.getEngine().start();
//        }else{
//            System.out.println("Lol, do your math first. You cannot fly now. Max speed is too low");
//        }
//    }
//}
