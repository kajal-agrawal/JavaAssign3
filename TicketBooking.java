class TicketBookingSystem {
    private int availableSeats;

    public TicketBookingSystem(int seats) {
        this.availableSeats = seats;
    }

    public synchronized void bookSeat(String userName, int requestedSeats) {
        if (requestedSeats <= availableSeats) {
            availableSeats -= requestedSeats;
            System.out.println(userName + " booked " + requestedSeats + " seat(s) successfully");
        } else {
            System.out.println(userName + " booking failed. Not enough seats");
        }
    }
}

class User1 extends Thread {
    private TicketBookingSystem system;
    private int seats;

    public User1(TicketBookingSystem system, int seats) {
        this.system = system;
        this.seats = seats;
    }

    public void run() {
        system.bookSeat("User1", seats);
    }
}

class User2 extends Thread {
    private TicketBookingSystem system;
    private int seats;

    public User2(TicketBookingSystem system, int seats) {
        this.system = system;
        this.seats = seats;
    }

    public void run() {
        system.bookSeat("User2", seats);
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        int availableSeats = 2;
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("User1 wants to book: 1");
        System.out.println("User2 wants to book: 2");

        TicketBookingSystem system = new TicketBookingSystem(availableSeats);

        User1 u1 = new User1(system, 1);
        User2 u2 = new User2(system, 2);

        u1.start();
        u2.start();
    }
}