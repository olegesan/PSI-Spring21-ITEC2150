package Session3.StartHere;

public class PhoneTester {
    public static void main(String[] args) {
        /*
        Old code. Delete or do not edit without need.
         */
        Phone cellPhone1 = new Phone("iPhone", "7", "iOS");
        cellPhone1.call();
        System.out.println(cellPhone1);

        App tiktok = new App("tiktok");
        App robinhood = new App("robinhood");

        cellPhone1.install(tiktok);
        cellPhone1.install(robinhood);

        System.out.println(cellPhone1);
        /*
        End of old code. Write your code below this line
         */

        // TODO: create a new phone object

        // TODO: create two new app objects

        // TODO: install apps on the phone object you've created

        // TODO: print the phone object
    }
}
