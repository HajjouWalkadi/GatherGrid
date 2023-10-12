package org.example.service;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.domain.Event;
import org.example.repository.EventRepository;

import java.util.List;
import java.util.stream.Collectors;

public class EventService {
    private final EventRepository eventRepository;

    public EventService() {
        eventRepository = new EventRepository();
    }
}
