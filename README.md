

```markdown
# Event Scheduler (Java Console App)

A simple Java console application to manage events.  
You can add, view, update, and remove events using a menu-driven interface.

---

## Features
- Add new events (title, description, date, location)  
- View all events  
- Update event details  
- Remove events by ID  
- Exit the program  

---

## Project Structure
```

src/com/abdul/eventscheduler/
│
├── App.java          # Main entry point
├── Event.java        # Event model (fields, getters, setters, toString)
├── EventService.java # Core event operations (add, view, update, remove)
└── EventUI.java      # User interface (menu and input handling)

````

---

## How to Run
1. Clone the repository:
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
