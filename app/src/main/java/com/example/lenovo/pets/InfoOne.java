package com.example.lenovo.pets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class InfoOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_one);
        ImageView img = (ImageView) findViewById(R.id.getImage);
        TextView n = (TextView) findViewById(R.id.getName);
        TextView d = (TextView) findViewById(R.id.getDes);
        Intent intent = getIntent();
        img.setImageResource(intent.getIntExtra("img",0));
        n.setText(intent.getStringExtra("name"));
        d.setText(intent.getStringExtra("txt"));
    }
}
