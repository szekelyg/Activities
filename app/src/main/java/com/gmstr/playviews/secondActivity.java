package com.gmstr.playviews;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class secondActivity extends AppCompatActivity {

    private TextView mytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mytext = findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();

        if(extras!=null){
            String whatIgot = extras.getString("activity_one");

            mytext.setText(whatIgot);
        }

    }

}
