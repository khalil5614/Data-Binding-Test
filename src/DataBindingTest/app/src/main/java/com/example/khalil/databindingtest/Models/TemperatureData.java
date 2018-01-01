package com.example.khalil.databindingtest.Models;

import android.content.Intent;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.example.khalil.databindingtest.BR;
import com.example.khalil.databindingtest.SecondActivity;

/**
 * Created by Khalil on 10/17/2017.
 */

public class TemperatureData extends BaseObservable {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private float celsius;

    @Bindable
    public float getCelsius() {
        return celsius;
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }

    public void celciusClick(View v) {
        Intent intent = new Intent(v.getContext(), SecondActivity.class);
        v.getContext().startActivity(intent);

    }

    public void setTemperatureClick() {
        setCelsius(++celsius);
    }

    private String temparatureType;

    @Bindable
    public String getTemparatureType() {
        return temparatureType;
    }

    public void setTemparatureType(String temparatureType) {
        this.temparatureType = temparatureType;
        notifyPropertyChanged(BR.temparatureType);
    }
}
