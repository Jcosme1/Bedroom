package Bedroom;

public class BuildMyBedroom {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");
        Size size = new Size(10,7);
        Ceiling ceiling = new Ceiling(4,"Gray", size);

        Bedroom myBedroom = new Bedroom("My Bedroom, ", wall1, wall2, wall3, wall4, ceiling, bed, desk, door);

        System.out.println(myBedroom);
    }
}
