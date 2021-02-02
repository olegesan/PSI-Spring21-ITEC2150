package Session2.StartHere;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    private String brand;
    private List<App> installedApps;
    private String model;
    private String OS;

    public Phone(String brand, String model, String OS) {
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        installedApps = new ArrayList<>();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<App> getInstalledApps() {
        return installedApps;
    }

    public void setInstalledApps(List<App> installedApps) {
        this.installedApps = installedApps;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void call() {
        System.out.println("ring-ring");
    }

    /*
    TODO:
    install method - accepts App as a parameter and adds to installed apps
    remove method - accepts App as a parameter and removes from install apps
    toString method - return String that will be printed when object of type Phone is printed to the console.
     */


}
