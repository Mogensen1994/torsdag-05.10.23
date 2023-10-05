import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(10, 5, 100);
        Room room2 = new Room(100, 1, 1);
        Room room3 = new Room(1, 5, 2);

        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        Building building = new Building(roomList, 2, 3, false);

        int totalLamps = countLampsInBuilding(building);
        System.out.println("Total number of lamps in the building: " + totalLamps);

        boolean isNormalBuilding = isNormal(building);
        if (isNormalBuilding) {
            System.out.println("This is a normal building.");
        } else {
            System.out.println("This is an odd building.");
        }
    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        ArrayList<Room> buildingRooms = building.getRooms();

        for (Room room : buildingRooms) {
            totalLamps += room.getNumberOfLamps();
        }

        return totalLamps;
    }

    public static boolean isNormal(Building building) {
        int numberOfFloors = building.getNumberOfFloors();
        int numberOfRooms = building.getRooms().size();

        if (numberOfFloors > numberOfRooms) {
            return true;
        } else {
            System.out.println("This is an odd building.");
            return false;
        }
    }
}
