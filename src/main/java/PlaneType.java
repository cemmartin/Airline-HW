public enum PlaneType {
    BOEING747("Boeing 747", 474, 747000),
    BOEING777("Boeing 777",777, 777000);

    private final String planeName;
    private final int capacity;

    private final int weight;

    PlaneType(String planeName, int capacity, int weight) {
        this.planeName = planeName;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getPlaneName() {
        return planeName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
