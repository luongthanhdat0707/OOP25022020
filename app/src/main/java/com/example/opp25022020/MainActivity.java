package com.example.opp25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Object và class
        //Object là một đối tượng, thông tin cụ thể, cá thể có đủ thông tin
        //Class là một đối tượng tượng trưng cho một tập thể, là một kiểu dữ liệu được tạo ra trong một tập thể và để xem tập thể đó có gì giống với nhau
        Person Luongthanhdat = new Person();
        Luongthanhdat.name="Luong Thanh Dat";
        Luongthanhdat.age = 10 ;
        Log.d("BBB",Luongthanhdat.name + " " + Luongthanhdat.age);


    }
}
