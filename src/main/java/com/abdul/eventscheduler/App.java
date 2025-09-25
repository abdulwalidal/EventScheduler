package com.abdul.eventscheduler;

public class App {
    public static void main(String[] args) {
        // Main entry point of the program

        // Example of creating an Event object (commented for now)
        // Event e = new Event(1, "team meeting", "about company", "21 August", "USA");
        // System.out.println(e);

        // Create EventService object (manages event operations)
        EventService service = new EventService();

        // Create EventUI object (handles user interface)
        EventUI IU = new EventUI();

        // Start the menu display for user interaction
        IU.display();

        // Direct call example (commented out, because menu already calls it)
        // service.addEvent();
    }
}
