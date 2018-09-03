package com.example.lenovo.pets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    String s = "This App is made for providing information" +
            "about Pet Animals including dogs,cats and birds." +
            "It shows their appearence an charecteristics.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView textView = (TextView) findViewById(R.id.text_info);
        textView.setText(s);
    }
}
