package com.singtel.assignment.model;

import com.singtel.assignment.behaviours.impl.singable.CanNotSing;
import com.singtel.assignment.behaviours.impl.swimmable.CanSwim;
import com.singtel.assignment.behaviours.impl.walkable.CanNotWalk;
import com.singtel.assignment.utils.Color;
import com.singtel.assignment.utils.Size;

public class Fish  extends Parent{

    protected Size size;
    protected Color color;

    public Fish(){
        this.swimmable=new CanSwim();
        this.walkable =new CanNotWalk();
        this.singable= new CanNotSing();
    }

    public Size size() {
        return size;
    }

    public Color color() {
        return color;
    }
}
