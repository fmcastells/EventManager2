package com.edgenda.bnc.skillsmanager.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.PersistenceConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Invitation {

    @Id
    @GeneratedValue
    private Long id;

    enum status {
        ACCEPTED,
        PENDING,
        REFUSED
    }

    @NotEmpty
    private long eventId;

    @NotEmpty
    private long guestId;

    @NotEmpty
    private String state;

    public Invitation() {
    }

    public Invitation(Long id, long eventId, long guestId, String status) {
        this.id = id;
        this.eventId = eventId;
        this.guestId = guestId;
        this.state = status;
    }

    @PersistenceConstructor
    public Invitation(long eventId, long guestId, String status) {
        this.eventId = eventId;
        this.guestId = guestId;
        this.state = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}