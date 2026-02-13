import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketSystemTest {

    @Test
    void generateTickets() {
        // Base Case
        TicketSystem sys = new TicketSystem();

        sys.generateTickets(5);
        assertEquals(5, sys.getQueue().size());
    }

    @Test
    void processTickets() {
        // Base Case
        TicketSystem sys = new TicketSystem();

        sys.generateTickets(5);
        sys.processTickets();
        assertEquals(0, sys.getQueue().size());
    }

    @Test
    void testCounter() {
        TicketSystem sys = new TicketSystem();

        sys.generateTickets(5);
        Ticket first = sys.getQueue().poll();
        Ticket second = sys.getQueue().poll();

        assertEquals(1, first.getTicketNumber());
        assertEquals(2, second.getTicketNumber());
    }


    @Test
    void testZeroTickets() {

        TicketSystem sys = new TicketSystem();

        sys.generateTickets(0);
        assertEquals(0, sys.getQueue().size());
    }

    @Test
    void testLargeQueues() {

        TicketSystem sys = new TicketSystem();

        sys.generateTickets(100);
        assertEquals(100, sys.getQueue().size());
    }

    @Test
    void processZeroTickets() {
        // Base Case
        TicketSystem sys = new TicketSystem();

        sys.generateTickets(0);
        sys.processTickets();
        assertEquals(0, sys.getQueue().size());
    }

}