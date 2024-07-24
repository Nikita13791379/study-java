public class Elevator {
    int currentFloor = 1;
    int minFloor;
    int maxFloor;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public boolean moveDown() {
        currentFloor = currentFloor - 1;
        return false;
    }

    public boolean moveUp() {
        currentFloor = currentFloor + 1;
        return false;
    }

    public void move(int floor) { // floor это этаж на который хотят попасть
        if (floor < minFloor || floor > maxFloor || floor == 0) {
            System.out.println("Такого этажа нет");
            System.exit(0);

            if (currentFloor == floor) {
                System.out.println("Указан текущий этаж");

            }
        }
        while (currentFloor != floor) {
            boolean i = currentFloor > floor ? moveDown() : moveUp();
            System.out.println(currentFloor);
        }
    }
}

