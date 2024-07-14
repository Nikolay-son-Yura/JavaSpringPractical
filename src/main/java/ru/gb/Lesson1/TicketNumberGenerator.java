package ru.gb.Lesson1;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TicketNumberGenerator {


    public String createNewNumber() {
        return UUID.randomUUID().toString();
    }
}
