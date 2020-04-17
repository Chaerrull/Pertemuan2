package com.example.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Almost extends AppCompatActivity {
    private Button verify;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);

        verify = (Button) findViewById(R.id.verify);
        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaVerify();
            }
        });
    }
    public void bukaVerify(){
        Intent intent = new Intent(this, com.example.pertemuan2.verify.class);
        startActivity(intent);
    }
}
