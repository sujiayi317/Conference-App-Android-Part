package com.example.a207_demo.eventSystem;

import android.os.Bundle;
import android.view.View;

import com.example.a207_demo.R;
import com.example.a207_demo.utility.ActivityCollector;

public class SpeakerEventContentActivity extends EventContentActivity implements View.OnClickListener{

    /**
     * Required function to initiate an Activity class.
     * @param savedInstanceState saved data for unexpected crush
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myevent_content_speaker);

        init();

        ActivityCollector.addActivity(this);
    }

}