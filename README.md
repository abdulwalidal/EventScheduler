
````markdown
## Description
A simple **Event Scheduler** program in **Java** to manage events.  
This console-based application allows users to add, view, update, and remove events with details such as title, description, date, and location.

---

## Features
- **Add Event**: Add a new event with details (title, description, date, location).  
- **View Events**: Display all saved events in a formatted list.  
- **Update Event**: Update the details of an existing event.  
- **Remove Event**: Delete an event by its ID.  
- **Exit**: Exit the application safely.  
---

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/event-scheduler.git
````

2. **Navigate to the project folder**:

   ```bash
   cd event-scheduler
   ```

3. **Compile the program**:

   ```bash
   javac src/com/abdul/eventscheduler/*.java
   ```

4. **Run the program**:

   ```bash
   java com.abdul.eventscheduler.App
   ```

---

## Usage

### Menu Options:

1. **Add Event** → Enter event details (title, description, date, location).
2. **View Events** → See all stored events in a list.
3. **Update Event** → Select an event by ID and update its details.
4. **Remove Event** → Select an event by ID to delete it.
5. **Exit** → Exit the program with a closing message.

---

## Code Overview

* **Event.java** → Defines the `Event` class with fields, constructor, getters/setters, and `toString()`.
* **EventService.java** → Handles core logic for adding, viewing, updating, and removing events.
* **EventUI.java** → Manages the menu, takes user input, and connects with `EventService`.
* **App.java** → Main entry point that starts the program and runs the UI.
