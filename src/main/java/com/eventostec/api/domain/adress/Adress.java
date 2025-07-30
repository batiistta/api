package com.eventostec.api.domain.adress;

import com.eventostec.api.domain.event.Event;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.UUID;

@Table(name = "adress")
@Entity
public class Adress {
    @Id
    private UUID id;
    private  String city;
    private String uf;
    @ManyToOne
    @JoinColumn (name = "event_id", nullable = false)
    private Event event;
}
