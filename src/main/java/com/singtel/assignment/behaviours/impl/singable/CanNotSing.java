package com.singtel.assignment.behaviours.impl.singable;

import com.singtel.assignment.behaviours.Singable;

public class CanNotSing implements Singable {


    @Override
    public void sing() {
        System.out.println("Can not sing");
    }
}
