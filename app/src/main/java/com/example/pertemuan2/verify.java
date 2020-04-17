package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class verify extends AppCompatActivity {
    private Button sendVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        sendVerify = (Button) findViewById(R.id.btn_send_verify);
        sendVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaUserHome();

            }
        });
    }
    public  void bukaUserHome(){
        Intent intent = new Intent(this,UserHome.class);
        startActivity(intent);
    }
}
