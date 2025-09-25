package com.abdul.eventscheduler;

import java.util.Scanner;

import com.abdul.eventscheduler.EventService;

public class EventUI {
    EventService esUI = new EventService();

    public void display() {
        while (true) {
            
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n **Welcome to Event Scheduler**");
        System.out.println("Here You can add your Scheduled Events or Ongoing Event\n");
        System.out.println("1. Add your Event");
        System.out.println("2. View All Events");
        System.out.println("3. Update your Event");
        System.out.println("4. Remove your Event");
        System.out.println("5. Exit");

        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                esUI.addEvent();    
                break;  

                case 2:
                esUI.viewEvents();
                break;

                case 3:
                esUI.updateEvent();
                break;

                case 4:
                esUI.removeEvent();
                break;

                case 5:
                esUI.exit();

                default:
                  
            }

        }







            
        }
         

         
        
         
         
       
    }
    


