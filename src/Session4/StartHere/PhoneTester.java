package Session4.StartHere;

public class PhoneTester {
    public static void main(String[] args) {
        //Legacy testing from session 1 and 2
        Phone cellPhone1 = new Phone("iPhone", "7", "iOS");
        cellPhone1.call();
        System.out.println(cellPhone1);

        App tiktok = new App("Tiktok", "TikTok Pte. ltd.", 383.8);
        App robinhood = new App("Robinhood", "Robinhood Markets, Inc.", 230.4);

        cellPhone1.install(tiktok);
        cellPhone1.install(robinhood);


        OnePLus6 onePLus = new OnePLus6();


        // Legacy testing from session 3
        Phone pixel = new Pixel("4a 5G");
        NikeRunningClub nrc = new NikeRunningClub();
        ClickUp clickUp = new ClickUp();
        pixel.install(nrc);
        pixel.install(clickUp);
//        System.out.println(pixel);


        //testing for session 4
        Pixel iphone = new Iphone("12 Pro");

        // use ClickUp, NikeRunningClub that are already instantiated.
        iphone.install();
        iphone.install();

        //make an instance of Reddit app using custom constructor
        // hint: you will have to pass some parameters to the constructor
        Reddit reddit = new Reddit();
        iphone.install(reddit);

        //display all the apps and their info installed on iphone.
        //Be sure to display karma and username of reddit app.
        iphone.displayInstalledApps();



































    }
}
