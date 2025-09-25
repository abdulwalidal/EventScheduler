package com.abdul.eventscheduler;

public class Event {
    
    // Event properties
    private int id;
    private String title;
    private String description;
    private String date;
    private String location;

    // Constructor -> creates an Event with given details
    Event(int id, String title, String description, String date, String location) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.location = location;
        this.title = title;
    }

    // Getter and Setter for ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for Title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for Description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter for Date
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    // Getter and Setter for Location
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    // toString() → this will be called when printing the object
    @Override
    public String toString() {
        return "Event Details:\n" +
               "  ID: " + id + "\n" +
               "  Title: " + title + "\n" +
               "  Description: " + description + "\n" +
               "  Date: " + date + "\n" +
               "  Location: " + location + "\n";
    }
}
