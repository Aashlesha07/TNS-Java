public class train_ticket {
	static int availableTickets = 5;
	
	String passengerName;
    int ticketNum;
    String destination;
    
    static {
    	System.out.println("Available tickets: " + train_ticket.availableTickets);
    }
    public train_ticket(String psngrName, String dest) {
		super();
		if (availableTickets > 0) {
            this.passengerName = psngrName;
            this.destination = dest;
            this.ticketNum = 6 - availableTickets; 
            availableTickets--; 
            System.out.println("Ticket booked successfully for " + psngrName);
        } else {
            System.out.println("No tickets available!");
        }
	}

    public String passengerName() {
        return passengerName;
    }

    public int getticketNum() {
        return ticketNum;
    }

    public String getdestination() {
        return destination;
    }

    public static int getRemainingSeats() {
        return availableTickets;
    }
	
	@Override
	public String toString() {
		return "Ticket Details: [Ticket Number: " + ticketNum + ", Passenger Name: " + passengerName + ",  Destination: " + destination + "]";
	}

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            train_ticket t1 = new train_ticket("Alice", "odisa");
            train_ticket t2 = new train_ticket("Bob", "kerla");
            train_ticket t3 = new train_ticket("Alex", "cst");
            System.out.println("\nAvailable tickets: " + train_ticket.availableTickets);
            train_ticket t4 = new train_ticket("Bobby", "Boston");
            train_ticket t5 = new train_ticket("Pippa", "Los Angeles");
            train_ticket t6 = new train_ticket("Alice", "New York");
    
            System.out.println("\nAvailable tickets: " + train_ticket.availableTickets);
            
            System.out.println(t5);
        }
}
    