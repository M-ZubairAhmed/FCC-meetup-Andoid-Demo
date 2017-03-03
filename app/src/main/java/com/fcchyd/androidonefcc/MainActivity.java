package com.fcchyd.androidonefcc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Putting up title in action bar
        titleInActionBar("freeCodeCamp-Android");

        //2.  Floatation action button initializing and setting up listener below
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floating_action_button_xml);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Write Fab method here
            }
        });
    }

    /**
     * This method puts up the title in toolbar or action bar of app
     *
     * @param title : The input title
     *              to know more about java documentation syntax
     *              http://www.oracle.com/technetwork/articles/java/index-137868.html
     */
    protected void titleInActionBar(String title) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle(title);

    }
}
