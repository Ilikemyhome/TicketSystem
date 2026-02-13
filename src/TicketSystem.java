import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import static java.lang.Thread.sleep;


public class TicketSystem {
    private Queue<Ticket> queue;
    private int ticketCounter;
    private Random random;


    public TicketSystem(){
        this.queue = new LinkedList<>();
        this.ticketCounter = 1;
        this.random = new Random();

    }

    public void generateTickets(int count) {
        for (int i = 0 ; i < count; i++) {
            Ticket ticket = new Ticket(ticketCounter++);
            queue.add(ticket);
            System.out.println("Generating Ticket: " + ticket);

            try{
                sleep(300 + random.nextInt(800));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void processTickets(){
        while(!queue.isEmpty()) {
            Ticket ticket = queue.poll();

            System.out.println("Processing Ticket: " + ticket);
            try{
                sleep(300 + random.nextInt(700));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public Queue<Ticket> getQueue(){
        return queue;
    }


}
