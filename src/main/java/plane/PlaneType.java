package plane;

public enum PlaneType {

    BOEING747(520, 412000),
    AIRBUS_A333(440, 371000),
    AIRBUS_A340(245, 275000),
    BOEING_777(298, 322000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
