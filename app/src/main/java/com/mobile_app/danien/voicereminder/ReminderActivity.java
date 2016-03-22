package com.mobile_app.danien.voicereminder;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


import java.util.ArrayList;

public class ReminderActivity extends AppCompatActivity {
    public static ArrayList<ReminderItem> result = new ArrayList<ReminderItem>();
    private TextView reminder_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        reminder_text = (TextView) findViewById(R.id.remind_Text);
        final Button ok_button = (Button) findViewById(R.id.ok_button);
        ok_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ReminderItem remindlist = new ReminderItem();
                String text = reminder_text.getText().toString();
                if (text != null) {
                    remindlist.setHeadLine(text);
                }
                result.add(remindlist);
                finish();

            }
        });
    }

}
