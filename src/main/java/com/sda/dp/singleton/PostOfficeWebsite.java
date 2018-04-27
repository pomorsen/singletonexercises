package com.sda.dp.singleton;

public class PostOfficeWebsite {
    public Ticket getTicket() {
        int ticketNumber = TicketGenerator.INSTANCE.generateNumber();
        Ticket ticket = new Ticket(ticketNumber);
        ticket.setFromWho("Website");

        return ticket;
    }
}
