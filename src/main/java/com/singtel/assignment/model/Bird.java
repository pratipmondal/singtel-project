package com.singtel.assignment.model;

import com.singtel.assignment.behaviours.impl.flyable.CanFly;
import com.singtel.assignment.behaviours.impl.singable.CanSing;
import com.singtel.assignment.behaviours.impl.walkable.CanWalk;

public class Bird extends Parent{

    public Bird(){
        this.walkable=new CanWalk();
        this.flyable =new CanFly();
        this.singable=new CanSing();
    }
}
