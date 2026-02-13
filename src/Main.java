public static void main(String[] args) {

    TicketSystem ticketSystem = new TicketSystem();

    System.out.println("Generating Tickets");
    ticketSystem.generateTickets(5);

    System.out.println("\nProcessing Tickets");
    ticketSystem.processTickets();




}