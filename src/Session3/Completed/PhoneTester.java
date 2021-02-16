package Session3.Completed;

public class PhoneTester {
    public static void main(String[] args) {
        Phone cellPhone1 = new Phone("iPhone", "7", "iOS");
        cellPhone1.call();
        System.out.println(cellPhone1);

        App tiktok = new App("Tiktok", "TikTok Pte. ltd.", 383.8);
        App robinhood = new App("Robinhood", "Robinhood Markets, Inc.", 230.4);

        cellPhone1.install(tiktok);
        cellPhone1.install(robinhood);


        OnePLus6 onePLus = new OnePLus6();
        System.out.println(onePLus);






































        Phone pixel = new Pixel("4a 5G");
        NikeRunningClub nrc = new NikeRunningClub("1.0.0");
        ClickUp clickUp = new ClickUp();
        pixel.install(nrc);
        pixel.install(clickUp);
        System.out.println(pixel);
    }
}
