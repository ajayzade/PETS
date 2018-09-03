package com.example.lenovo.pets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_two);
        Intent intent = getIntent();
        ImageView img = (ImageView) findViewById(R.id.getImage2);
        TextView n = (TextView) findViewById(R.id.getName2);
        TextView d = (TextView) findViewById(R.id.getDes2);
        img.setImageResource(intent.getIntExtra("img",0));
        n.setText(intent.getStringExtra("name"));
        d.setText(intent.getStringExtra("txt"));
    }
}
