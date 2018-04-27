package com.sda.dp.singleton;

public enum  TicketGenerator {
    INSTANCE;

    private int ticketNumber = 0;
    public int generateNumber() {
        return ticketNumber++;
    }
}
