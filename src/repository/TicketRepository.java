package repository;

import exception.TicketNotFoundException;
import models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer, Ticket> ticketRepository;

    public TicketRepository() {
        this.ticketRepository = new HashMap<>();
    }

    public Ticket get(int ticketId){
        Ticket ticket = ticketRepository.get(ticketId);
        if(ticket == null){
            throw new TicketNotFoundException("Ticket not found for id : " + ticketId);
        }
        return ticket;
    }

    public void put(Ticket ticket){
        ticketRepository.put(ticket.getId(), ticket);
        System.out.println("Ticket has been added successfully");
    }
}
