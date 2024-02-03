package Bedroom;

public class BuildMyBedroom {

    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
       Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");
        Size size = new Size(10,7);
        Ceiling ceiling = new Ceiling(4,"Gray", size);
        Bed bed = new Bed(2,"Queen", "blue","wood");
        Desk desk = new Desk("Brown","rectangle","wood");
        Door door = new Door(size, "white", "plywood");
        Bedroom myBedroom = new Bedroom("Ana", wall1, wall2, wall3, wall4, ceiling, bed, desk, door);
        // needed to add a tostirng to the bedroom class otherwise java would i think
        // literally just give you the location in memory or something
        // seems like we're abstracting parts of a room and putting it together into one toString
        System.out.println(myBedroom);
    }
}
