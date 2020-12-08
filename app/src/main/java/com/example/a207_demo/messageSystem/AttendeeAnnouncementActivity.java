package com.example.a207_demo.messageSystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a207_demo.R;
import com.example.a207_demo.utility.ActivityCollector;

public class AttendeeAnnouncementActivity extends AnnouncementActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement_attendee);

        init();

        ActivityCollector.addActivity(this);
    }

    /**
     * init
     */
    public void init() {
        super.init(this, R.id.nav_view_attendee, R.id.nav_announcements_attendee);
        super.createAnnouncementMenu();
    }
}