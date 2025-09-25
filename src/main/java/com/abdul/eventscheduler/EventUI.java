package com.abdul.eventscheduler;

import java.util.Scanner;

public class EventUI {
    // Creating an object of EventService to call its methods
    EventService esUI = new EventService();

    // Main display menu method
    public void display() {
        while (true) {
            // Scanner to take user input
            Scanner sc = new Scanner(System.in);

            // Menu options for user
            System.out.println("\n** Welcome to Event Scheduler **");
            System.out.println("Here you can add your Scheduled Events or Ongoing Events\n");
            System.out.println("1. Add your Event");
            System.out.println("2. View All Events");
            System.out.println("3. Update your Event");
            System.out.println("4. Remove your Event");
            System.out.println("5. Exit");

            // Taking user choice
            int choice = sc.nextInt();

            // Switch case to handle user selection
            switch (choice) {
                case 1:
                    esUI.addEvent();    // Calls addEvent from EventService
                    break;

                case 2:
                    esUI.viewEvents(); // Calls viewEvents
                    break;

                case 3:
                    esUI.updateEvent(); // Calls updateEvent
                    break;

                case 4:
                    esUI.removeEvent(); // Calls removeEvent
                    break;

                case 5:
                    esUI.exit(); // Exits program
                    break;

                default:
                    System.out.println("Invalid choice, please try again!");
            }
        }
    }
}
