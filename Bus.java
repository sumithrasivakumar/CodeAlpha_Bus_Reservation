package bus_reservation;

import java.util.Scanner;

class Bus {
    private int busNo;
    private String driver;
    private int capacity;
    private int bookedSeats;

    public Bus(int busNo, String driver, int capacity) {
        this.busNo = busNo;
        this.driver = driver;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public int getBusNo() {
        return busNo;
    }

    public void showBusInfo() {
        System.out.println("Bus No: " + busNo + " | Driver: " + driver +
                " | Capacity: " + capacity + " | Booked: " + bookedSeats);
    }

    public boolean bookSeat(int seats) {
        if (bookedSeats + seats <= capacity) {
            bookedSeats += seats;
            System.out.println(seats + " seat(s) booked successfully!");
            return true;
        } else {
            System.out.println("Not enough seats available!");
            return false;
        }
    }

    public void cancelSeat(int seats) {
        if (seats <= bookedSeats) {
            bookedSeats -= seats;
            System.out.println(seats + " seat(s) cancelled successfully!");
        } else {
            System.out.println("You cannot cancel more seats than booked!");
        }
    }

    public int getAvailableSeats() {
        return capacity - bookedSeats;
    }
}


