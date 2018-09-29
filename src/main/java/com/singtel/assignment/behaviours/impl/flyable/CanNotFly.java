package com.singtel.assignment.behaviours.impl.flyable;

import com.singtel.assignment.behaviours.Flyable;

public class CanNotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Can not fly");
    }
}
