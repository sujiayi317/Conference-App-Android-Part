package com.example.a207_demo.eventSystem;

import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

import com.example.a207_demo.R;
import com.example.a207_demo.utility.ActivityCollector;

import java.util.ArrayList;
import java.util.List;

/**
 * Event activity of events attendee signed up for.
 */
public class AttendeeMyEventActivity extends EventActivity {

    private ArrayList<ArrayList<String>> eventList;
    private AttendeeMyEventAdapter attendeeMyEventAdapter;

    /**
     * Required function to initiate an Activity class.
     *
     * @param savedInstanceState saved data for unexpected crush
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_attendee);

        init();

        ActivityCollector.addActivity(this);
    }

    /**
     * Set up the activity.
     */
    @Override
    public void init() {
        super.init(this, R.id.nav_view_attendee, R.id.nav_myEvents);
        createEventMenu();
    }

    protected void createEventMenu() {
        RecyclerView recyclerView = findViewById(R.id.event_recycler_view);
        super.createEventMenu(recyclerView);
        initEvents();
        attendeeMyEventAdapter = new AttendeeMyEventAdapter(this, eventList);
        recyclerView.setAdapter(attendeeMyEventAdapter);
    }

    /**
     *  initialise Events
     */
    @Override
    protected void initEvents() {
        super.initEvents();
        eventList = getEventManager().generateAllInfo(getEventManager().getEventsFromAttendee(getID()));
    }

    protected void refreshEvents(){
        createEventMenu();
        attendeeMyEventAdapter.notifyDataSetChanged();
        super.refreshEvents();
    }

}