package com.example.opp25022020;

import android.util.Log;

public class User extends Person{

    @Override
    public void showName() {
        Log.d("BBB","Username: " + super.name);
    }
}
