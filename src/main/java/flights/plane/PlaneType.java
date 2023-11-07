package flights.plane;

public enum PlaneType {
    BOEING747(474, 747000),
    BOEING777(777, 777000);


    private final int capacity;

    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
