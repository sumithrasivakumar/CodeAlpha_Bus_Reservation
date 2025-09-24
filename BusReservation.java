package bus_reservation;

import java.util.Scanner;

public class BusReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a bus
        Bus bus1 = new Bus(101, "Mr. Kumar", 40);

        int choice;
        do {
            System.out.println("\n=== Bus Reservation System ===");
            System.out.println("1. Show Bus Info");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Check Available Seats");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bus1.showBusInfo();
                    break;
                case 2:
                    System.out.print("Enter number of seats to book: ");
                    int seatsToBook = sc.nextInt();
                    bus1.bookSeat(seatsToBook);
                    break;
                case 3:
                    System.out.print("Enter number of seats to cancel: ");
                    int seatsToCancel = sc.nextInt();
                    bus1.cancelSeat(seatsToCancel);
                    break;
                case 4:
                    System.out.println("Available seats: " + bus1.getAvailableSeats());
                    break;
                case 5:
                    System.out.println("Thank you for using Bus Reservation System!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}

