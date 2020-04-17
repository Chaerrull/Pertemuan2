package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
    private Button regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regis = (Button) findViewById(R.id.btn_regis);
        regis.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        almostThere();
                    }
                });
    }
    public void almostThere(){
        Intent intent = new Intent(this, Almost.class);
        startActivity(intent);
    }
}
