package com.abdul.eventscheduler;

public class Event {
    
    private int id;
    private String title;
    private String description;
    private String date;
    private String location;

    Event(int id, String title, String description, String date, String location) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.location = location;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

  
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
