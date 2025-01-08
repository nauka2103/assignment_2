package transport;

import java.util.Objects;

public class Bus extends TransportEntity {
    private String busNumber;
    private String driverName;
    private int capacity;

    public Bus(String busNumber, String driverName, int capacity) {
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.capacity = capacity;
    }

    public String getKey() {
        return busNumber; // The unique identifier for a Bus is its bus number
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        return "Bus{" +
                "busNumber='" + busNumber + '\'' +
                ", driverName='" + driverName + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bus bus = (Bus) obj;
        return capacity == bus.capacity &&
                Objects.equals(busNumber, bus.busNumber) &&
                Objects.equals(driverName, bus.driverName);
    }

    public int hashCode() {
        return Objects.hash(busNumber, driverName, capacity);
    }
}
