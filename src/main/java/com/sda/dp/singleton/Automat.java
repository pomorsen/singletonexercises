package com.sda.dp.singleton;

public class Automat {
    public Ticket getTicket() {
        int ticketNumber = TicketGenerator.INSTANCE.generateNumber();
        Ticket ticket = new Ticket(ticketNumber);
        ticket.setFromWho("Automat");

        return ticket;
    }
}
