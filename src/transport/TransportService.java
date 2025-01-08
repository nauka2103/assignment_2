package transport;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransportService {
    private List<Bus> buses; // Encapsulated list of buses

    public TransportService() {
        this.buses = new ArrayList<>();
    }

    public void addBus(Bus bus) {
        buses.add(bus); // Adds a new bus to the collection
    }

    public List<Bus> getAllBuses() {
        return new ArrayList<>(buses); // Returns a copy of the list for safety
    }

    public List<Bus> filterByCapacity(int minCapacity) {
        return buses.stream()
                .filter(bus -> bus.getCapacity() >= minCapacity)
                .collect(Collectors.toList());
    }

    public Bus searchByBusNumber(String busNumber) {
        return buses.stream()
                .filter(bus -> bus.getBusNumber().equalsIgnoreCase(busNumber))
                .findFirst()
                .orElse(null);
    }

    public List<Bus> sortByCapacity(boolean ascending) {
        return buses.stream()
                .sorted(ascending ? Comparator.comparingInt(Bus::getCapacity)
                        : Comparator.comparingInt(Bus::getCapacity).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "TransportService{" +
                "buses=" + buses +
                '}';
    }
}
