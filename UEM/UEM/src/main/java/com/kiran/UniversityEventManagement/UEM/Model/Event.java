package com.kiran.UniversityEventManagement.UEM.Model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int eventId;
    String eventName;
    String Location;
    Instant date;
    Instant start;
    Instant end;
    String url;

    public Event() {
    }

    public Event(int eventId, String eventName, String location, Instant date, Instant start, Instant end, String url) {
        this.eventId = eventId;
        this.eventName = eventName;
        Location = location;
        this.date = date;
        this.start = start;
        this.end = end;
        this.url = url;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getEnd() {
        return end;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
