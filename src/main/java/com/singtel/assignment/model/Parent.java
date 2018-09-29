package com.singtel.assignment.model;

import com.singtel.assignment.behaviours.Flyable;
import com.singtel.assignment.behaviours.Singable;
import com.singtel.assignment.behaviours.Walkable;
import com.singtel.assignment.behaviours.impl.swimmable.CanSwim;

public abstract class Parent {

    protected Walkable walkable;
    protected Flyable flyable;
    protected Singable singable;
    protected CanSwim swimmable;

    /**
     * Need to be refactored
     */
    public void walk(){
        this.walkable.walk();
    }

    public void fly() {
        this.flyable.fly();
    }

    public void sing() {
        this.singable.sing();
    }

    public void swim() {
        this.swimmable.swim();
    }


    public Walkable getWalkable() {
        return walkable;
    }

    public void setWalkable(Walkable walkable) {
        this.walkable = walkable;
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Singable getSingable() {
        return singable;
    }

    public void setSingable(Singable singable) {
        this.singable = singable;
    }

    public CanSwim getSwimmable() {
        return swimmable;
    }

    public void setSwimmable(CanSwim swimmable) {
        this.swimmable = swimmable;
    }
}
