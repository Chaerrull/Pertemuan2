package com.example.pertemuan2;
/*
Mohammad Chaerrull Febriansyah
10117171 -IF5
15-April : Membuat tampilan halaman 1(MainActivity) , 2(Register) dan 3(Almost)
16-April : Membuat Tampilan halaman 4(verify) dan 5(userHome)
17-April : Mengimplementasikan Fungsi Fungsi yang ada

 */

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
