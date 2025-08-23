package com.abdul.eventscheduler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Event e = new Event(1, "team meeting", "about company", "21 August", "USA");
        // System.out.println(e);

        EventService service = new EventService();
     
       service.addEvent();
       
        
    }
}
