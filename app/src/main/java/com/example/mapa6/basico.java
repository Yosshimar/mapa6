package com.example.mapa6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class basico extends AppCompatActivity {
    Button bt61,bt62,bt63;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basico);

        bt61=findViewById(R.id.bt661);
        bt62=findViewById(R.id.bt662);
        bt63=findViewById(R.id.bt663);
        bt61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapa61=new Intent(basico.this,mapa61.class);
                startActivity(mapa61);
            }
        });

        bt62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapa62=new Intent(basico.this,mapa62.class);
                startActivity(mapa62);
            }
        });

        bt63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapa63=new Intent(basico.this,mapa63.class);
                startActivity(mapa63);
            }
        });
    }

}