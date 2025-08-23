package com.abdul.eventscheduler;

import java.util.HashMap;
import java.util.Scanner;

public class EventService {
    // this class would handle all the functionalities 

    // i am using Hashmaps for storing the events

    private HashMap <Integer, Event> events;
    private int nextId;
    
    public EventService () {
        events = new HashMap<>();
        nextId = 1;

    }


    // add a new event 
    public void addEvent() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the title name");
     String title = sc.nextLine();

     System.out.println("Enter the description of your Event");
     String description = sc.nextLine();

    System.out.println("Enter your location of your Event");
    String location = sc.nextLine();
    
    System.out.println("Enter the date of your Event");
    String date = sc.nextLine();

    // Create Event object (this would store this all the input data)
      Event e = new Event(nextId, title, description, date, location);   
      events.put(nextId, e);

      nextId++;
      System.out.println("Event added successfully!");
    }

    
}
