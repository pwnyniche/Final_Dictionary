package com.example.textreg2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView textReg;
    CardView dictionary;
    CardView aboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textReg=findViewById(R.id.textDetect);
        textReg.setOnClickListener(this);
        dictionary=findViewById(R.id.wordSearch);
        dictionary.setOnClickListener(this);
        aboutUs=findViewById(R.id.aboutUs);
        aboutUs.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.textDetect)
        {
            Intent intent = new Intent(this,textRegActivity.class);
            startActivity(intent);
        }
        if (v.getId()==R.id.aboutUs)
        {
            Intent infoIntent=new Intent(this, InfoActivity.class);
            startActivity(infoIntent);
        }
    }
}