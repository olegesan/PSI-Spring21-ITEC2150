package Session2.Completed;

public class PhoneTester {
    public static void main(String[] args) {
        Phone cellPhone1 = new Phone("iPhone", "7", "iOS");
        cellPhone1.call();
        System.out.println(cellPhone1);

        App tiktok = new App("tiktok");
        App robinhood = new App("robinhood");

        cellPhone1.install(tiktok);
        cellPhone1.install(robinhood);

        System.out.println(cellPhone1);
    }
}
