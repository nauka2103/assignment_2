import transport.Bus;
import transport.TransportService;

public class Main {
    public static void main(String[] args) {
        TransportService transportService = new TransportService();

        // Add buses
        transportService.addBus(new Bus("123A", "John Doe", 50));
        transportService.addBus(new Bus("456B", "Jane Smith", 30));
        transportService.addBus(new Bus("789C", "Alan Turing", 40));

        // Display all buses
        System.out.println("All Buses:");
        System.out.println(transportService.getAllBuses());

        // Filter buses by capacity
        System.out.println("\nBuses with capacity >= 40:");
        System.out.println(transportService.filterByCapacity(40));

        // Search for a bus by number
        System.out.println("\nSearch for Bus with number 123A:");
        System.out.println(transportService.searchByBusNumber("123A"));

        // Sort buses by capacity
        System.out.println("\nBuses sorted by capacity (ascending):");
        System.out.println(transportService.sortByCapacity(true));

        System.out.println("\nBuses sorted by capacity (descending):");
        System.out.println(transportService.sortByCapacity(false));
    }
}
