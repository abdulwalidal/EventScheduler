package com.abdul.eventscheduler;
import com.abdul.eventscheduler.EventUI;


public class App 
{
    public static void main( String[] args )
    {
        // Event e = new Event(1, "team meeting", "about company", "21 August", "USA");
        // System.out.println(e);

        EventService service = new EventService();
        EventUI IU = new EventUI();
        IU.display();
     
    //    service.addEvent();
       
        
    }
}
