package Bedroom;

public class Bed {
    private int numberOfPillows;
    private String size;
    private String color;
    private String material; //wood metal

    public Bed(int numberOfPillows, String size, String color, String material) {
        this.numberOfPillows = numberOfPillows;
        this.size = size;
        this.color = color;
        this.material = material;
    }
    public void make(){
        System.out.println("make() is from  ");
    }
}