package com.example.khalil.databindingtest;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.khalil.databindingtest.Models.TemperatureData;
import com.example.khalil.databindingtest.Models.User;
import com.example.khalil.databindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Ibrahim", "Khalil");
        mainBinding.setUser(user);
        user.setFirstName("Md. Ibrahim");
        mainBinding.notifyChange();


        TemperatureData temparature = new TemperatureData();
        temparature.setLocation("Bangladesh");
        temparature.setCelsius(32.2f);
        mainBinding.setTemp(temparature);
        //temparature.setTemparatureType("Celcius");
    }
}
