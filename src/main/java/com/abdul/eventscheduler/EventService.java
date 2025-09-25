package com.abdul.eventscheduler;

import java.util.HashMap;
import java.util.Scanner;

public class EventService {
  
    // This class handles all the functionalities for managing Events
    // Like: add, view, update, remove, and exit

    // Using HashMap to store all events
    // Key = Event ID (Integer), Value = Event object
    private HashMap<Integer, Event> events;

    // This keeps track of the next unique ID for events
    private int nextId; 

    // Scanner for user input
    private Scanner sc = new Scanner(System.in);

    // Constructor -> runs automatically when object of EventService is created
    public EventService() {
        events = new HashMap<>(); // start with empty event list
        nextId = 1;               // first event will get ID = 1
    }

    // Add a new Event
    public void addEvent() {
        // Asking user for event details
        System.out.println("Enter the title name");
        String title = sc.nextLine();

        System.out.println("Enter the description of your Event");
        String description = sc.nextLine();

        System.out.println("Enter your location of your Event");
        String location = sc.nextLine();

        System.out.println("Enter the date of your Event");
        String date = sc.nextLine();

        // Create new Event object with given details and unique ID
        Event e = new Event(nextId, title, description, date, location);

        // Store the event in HashMap with its ID as key
        events.put(nextId, e);

        // Increase nextId so the next event gets a different ID
        nextId++;

        System.out.println("Event added successfully!");
    }

    // Show all Events
    public void viewEvents() {
        // If no events exist → show message
        if (events.isEmpty()) {
            System.out.println("There are no Events");
        } 
        // If events exist -> print each one
        else {
            for (Event e : events.values()) {
                System.out.println(e);  // calls Event.toString() method
            }
        }
    }

    // Update an Event
    public void updateEvent() {
        System.out.println("Which Event you want to update?");
        int updateEventno = sc.nextInt(); 
        sc.nextLine(); // fix scanner issue (consume newline)

        // Check if event with given ID exists
        if (events.containsKey(updateEventno)) {
            // Get the event object
            Event event = events.get(updateEventno);

            // Update Title
            System.out.println("Enter the new title name (leave blank to keep current: " + event.getTitle() + ")");
            String title = sc.nextLine();
            if (!title.isEmpty()) {
                event.setTitle(title); // update only if user typed something
            }

            // Update Description
            System.out.println("Enter the new description (leave blank to keep current: " + event.getDescription() + ")");
            String description = sc.nextLine();
            if (!description.isEmpty()) {
                event.setDescription(description);
            }

            // Update Location
            System.out.println("Enter the new location (leave blank to keep current: " + event.getLocation() + ")");
            String location = sc.nextLine();
            if (!location.isEmpty()) {
                event.setLocation(location);
            }

            // Update Date
            System.out.println("Enter the new date (leave blank to keep current: " + event.getDate() + ")");
            String date = sc.nextLine();
            if (!date.isEmpty()) {
                event.setDate(date);
            }

            System.out.println("Event updated successfully!");
        } else {
            System.out.println("Event ID was not found."); // event doesn’t exist
        }
    }

    // Remove an Event
    public void removeEvent() {
        System.out.println("Which event do you want to remove?");
        int removeEventno = sc.nextInt(); // user enters event ID

        // Check if that ID exists
        if (events.containsKey(removeEventno)) {
            events.remove(removeEventno); // remove from HashMap
            System.out.println("The Event is Removed");
        } else {
            System.out.println("Event ID was not Found"); // no such event
        }
    }

    // Exit Program
    public void exit() {
        System.out.println("Exiting...");
        System.exit(0); // stops the whole program
    }
}
