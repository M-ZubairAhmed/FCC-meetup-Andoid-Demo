package com.fcchyd.androidonefcc;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Putting up title in action bar
        titleInActionBar("freeCodeCamp-Android");

        // Floatation action button initializing and setting up listener below
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floating_action_button_xml);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createNewTask();
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

    protected void createNewTask(){
        LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
        View alertDialogView = layoutInflater.inflate(R.layout.alert_dialog,null);
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setView(alertDialogView)
                .setTitle(R.string.alert_dialog_title)
                .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //
                    }
                })
                .create();
        alertDialog.show();
    }
}
