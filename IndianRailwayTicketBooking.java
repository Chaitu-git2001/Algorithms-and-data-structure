class Passenger {
    
    private String name;
    private int age;
    private String seatType;

    static int totalPassengers = 0;

    
    Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.seatType = "General";  // Default seat type
        totalPassengers++;
    }

    
    Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        totalPassengers++;
    }

    
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Seat: " + seatType);
    }
}

public class IndianRailwayTicketBooking {
    public static void main(String[] args) {
        // Creating passenger objects
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
        Passenger p3 = new Passenger("Suresh", 40);

        
        System.out.print("Passenger1: ");
        p1.displayDetails();

        System.out.print("Passenger2: ");
        p2.displayDetails();

        System.out.print("Passenger3: ");
        p3.displayDetails();

        
        System.out.println("Total Passengers Booked: " + Passenger.totalPassengers);
    }
}
