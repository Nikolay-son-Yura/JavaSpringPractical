package ru.gb.Lesson1;

import org.springframework.stereotype.Component;

@Component
public class CallScreen {
    private final TicketNumberGenerator ticketNumberGenerator;

    public CallScreen(TicketNumberGenerator ticketNumberGenerator) {
        this.ticketNumberGenerator = ticketNumberGenerator;
    }

    public Ticket newTicket() {
        return new Ticket(ticketNumberGenerator.createNewNumber());
    }

}
