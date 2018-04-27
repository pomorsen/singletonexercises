package com.sda.dp.singleton;

public class Reception {
    public Ticket getTicket() {
        int ticketNumber = TicketGenerator.INSTANCE.generateNumber();
        Ticket ticket = new Ticket(ticketNumber);
        ticket.setFromWho("Reception");

        return ticket;
    }
}
