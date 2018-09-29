package com.singtel.assignment.model;

import com.singtel.assignment.behaviours.impl.walkable.CanWalk;

public class Animal extends Parent {

    public Animal(){
        this.walkable=new CanWalk();
    }
}
