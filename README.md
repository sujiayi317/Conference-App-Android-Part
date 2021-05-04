# Project Phase 2

### 1. Mandatory extensions

-   There will now be many types of events. A one-speaker event is the same as a "talk" from Phase 1. You can have multi-speaker events, like a panel discussion, and no-speaker events, like a party. Events can last as long as you want. You can measure the duration of an event in hours, or minutes. You get to decide.
-   Events can be canceled by at least one organizer.
-   At least one more type of user will be included in your program. For example, an Admin user who can delete messages or events with no attendees, or a VIP user who can access VIP-only events.
-   Organizers can also create Speaker accounts, Attendee accounts, and any other type of user accounts that are in your program.
-   Each event has a maximum number of people who can attend it. This amount can be set when the event is created and also changed later, by an organizer. Your program should check the maximum capacity for the room where the event will be held, and prevent the number of attendees from going above the room's capacity.

### 2. Optional Extensions (Choose 4*)

You will implement four of these, unless you implement a GUI. Please see the note below the list. Also, if your group has fewer than 7 members, please see an instructor during an office hour or after lecture to discuss how many of the features in this section you are required to implement.

-   Allow the same users to log in and select which conference they want to participate in. Here, participation means viewing and signing up for events. The inbox can be conference-specific, or one general inbox for all messages from all conferences to that user. You decide which one.
-   Enhance the user's messaging experience by allowing them to "mark as unread", delete, or archive messages after reading them.
-   Have the program produce a neatly formatted program or schedule for the conference that users have the option of "downloading" (outputting it as html, pdf, or similar). Alternatively, if you just want the program to print the schedule to the screen, then users should be able to request a schedule by at least three of: day, by speaker, by time (all 3-4 pm talks on all days), or just the ones they have signed up for, or "liked" events (where you have to enable users to "like" events).
-   Add additional constraints to the scheduling for various types of events (e.g. technology requirements for presentations, tables vs rows of chairs). When organizers are creating events, they can see a suggested list of rooms that fit the requirements of their event.
-   Allow the system to support additional user requests (e.g. dietary restrictions, accessibility requirements) where organizers can tag a request as "pending" or "addressed". All organizers see the same list of requests, so if one tags a request as addressed, all other organizers can log in and see that.
-   Use a database to store the information from your program through specific gateway class(es) so that you do not violate Clean Architecture and still have an Entity layer.
-   Expand the menus available to organizers to allow them to get useful summary stats about the conference. Include app traffic statistics, event enrollment statistics, and top-five lists (or something similar). You should include enough statistics to make this option as complicated as the other ones on this list.
-   Replace your text UI with a Graphic User Interface (GUI), which should follow the Model-View-Presenter architecture. See the note below.
