package com.example.ibrahim.test;

import android.util.Log;

public class Animal {
    private String name;
    private String color;

    public String getName() {
        return name;
    }/123456789012345678

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void doSomething() {
        Log.i("Action","roar");
    }

    void doSomething(String food) {
        Log.i("Action","relax");
    }
}
