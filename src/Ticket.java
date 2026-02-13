import java.time.LocalDateTime;

public class Ticket {
    private int ticketNumber;
    private LocalDateTime timestamp;

    public Ticket(int ticketNumber){
        this.ticketNumber = ticketNumber;
        this.timestamp = LocalDateTime.now();

    }

    public LocalDateTime getTimeStamp(){
        return timestamp;
    }

    public int getTicketNumber(){
        return ticketNumber;
    }

    @Override
    public String toString(){
        return "Ticket Number: " + ticketNumber + " Timestamp: " + timestamp;
    }
}
