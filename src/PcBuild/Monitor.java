package PcBuild;
/*
Brand
model
max resolution
screen size
refresh rate
 */
public class Monitor {
    private String manfacturer;
    private String brand;
    private Resolution resolution;
    private double screenSize;
    private int refreshRate;


    public Monitor(String manfacturer, String brand, Resolution resolution, double screenSize, int refreshRate) {
        this.manfacturer = manfacturer;
        this.brand = brand;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
    }
}
