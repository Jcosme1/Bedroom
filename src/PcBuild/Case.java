package PcBuild;
/*
Product Height 18.35 inches
Product Width 9.06 inches
Product Depth 17.83 inches
Window Panel(s) Right side
Case Material Steel, Glass, Plastic
 */
public class Case {
    private String model;
    private String brand;
    private String matieral;
    private Dimension dimension;
    public Case(String model, String brand, String matieral, Dimension dimension){
        this.model = model;
        this.brand = brand;
        this.matieral = matieral;
        this.dimension = dimension;

    }
    public void pressPower(){
        System.out.println("Case Class: Press the power key - Pressed");
    }

}
