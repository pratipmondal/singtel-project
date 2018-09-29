package com.singtel.assignment.model.birds;

import com.singtel.assignment.behaviours.impl.singable.RoosterSound;
import com.singtel.assignment.model.Bird;

public class Rooster extends Bird {

    Chicken chicken;

    public Rooster(){
        this.singable= new RoosterSound();
        this.chicken=new Chicken();
    }

    @Override
    public void fly(){
        this.chicken.fly();
    }
}
