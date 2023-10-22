package model;

public class Battery {
    private int capacity;

    public Battery() {
    }

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Battery{");
        sb.append("capacity=").append(capacity);
        sb.append('}');
        return sb.toString();
    }
}
