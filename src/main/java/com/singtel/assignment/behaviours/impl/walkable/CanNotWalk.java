package com.singtel.assignment.behaviours.impl.walkable;

import com.singtel.assignment.behaviours.Walkable;

public class CanNotWalk implements Walkable {

    @Override
    public void walk() {
        System.out.println("Can not walk");
    }
}
