````markdown
# Event Scheduler (Java Console App)

This is a simple Java console application that helps you manage events.  
It allows you to add, view, update, and remove events using a menu-driven interface.

---

## Features
The application provides the following features:
- Add new events with title, description, date, and location  
- View all saved events  
- Update existing event details  
- Remove events by their ID  
- Exit the application safely  

---

## Project Structure
The source code is organized as follows:

- `App.java` → Main entry point of the program  
- `Event.java` → Event model (fields, getters, setters, toString)  
- `EventService.java` → Core event operations (add, view, update, remove)  
- `EventUI.java` → User interface (menu and input handling)  

---

## How to Run
1. Clone the repository using:
   ```bash
   git clone https://github.com/your-username/event-scheduler.git
   cd event-scheduler
````

2. Compile the Java files:

   ```bash
   javac src/com/abdul/eventscheduler/*.java
   ```
3. Run the program:

   ```bash
   java com.abdul.eventscheduler.App
   ```
Do you also want me to add a **small “Sample Run” section** (just the menu screenshot in text) at the end for clarity?
```
