package com.brunet.aurelia.middleproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    // exo3
    TextView monTexte = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // exo1
        //setContentView(R.layout.activity_main);

        /* exo2
        String presentation = getResources().getString(R.string.hello_world);
        presentation = presentation.replace("Hello", "Salut");
        TextView view = new TextView(this);
        view.setText(presentation);
        setContentView(view);
        */



        // exo3
        setContentView(R.layout.activity_main);
        monTexte = (TextView)findViewById(R.id.pres);
        monTexte.setText("Mon application est la plus cool.");




    }
}
