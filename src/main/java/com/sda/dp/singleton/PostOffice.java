package com.sda.dp.singleton;

public class PostOffice {
    private PostOfficeWebsite website = new PostOfficeWebsite();
    private Reception reception = new Reception();
    private Automat automat = new Automat();

    public Ticket fromWebsite() {
        return website.getTicket();
    }

    public Ticket fromAutomat() {
        return automat.getTicket();
    }

    public Ticket fromReception() {
        return reception.getTicket();
    }
}
