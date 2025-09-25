package com.abdul.eventscheduler;

import java.util.HashMap;
import java.util.Scanner;

public class EventService {
  
    // this class would handle all the functionalities 

    // using Hashmaps for storing the events

    private HashMap <Integer, Event> events; // this stores all the events
    private int nextId; // event's unique key
    
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

  // this method would show all the events
    public void viewEvents() {
      // this condition checks if there are events or not
      if(events.isEmpty()) {
        System.out.println("There are no Events");

      }
      // this would print all the events using foreach loop
      else {
        for (Event e : events.values()) {
          System.out.println(e);   
        }
      }
    }

    public void updateEvent() {
      
    }



     // method for removing Event
      public void removeEvent() {
        Scanner sc = new Scanner(System.in);
      System.out.println("Which event do you want to remove?");
      int removeEventno = sc.nextInt(); // this is the Event's typically ID

      if(events.containsKey(removeEventno)) {  // this checks "is there any event standing on that specific no"
        events.remove(removeEventno); // this would remove that event
        System.out.println("The Event is Removed");

      } else {
        System.out.println("Event ID was not Found");
      }


      }

      public void exit() {
        System.out.println("Exiting...");
        System.exit(0);
      }

    


    
      
    


    

    
}
