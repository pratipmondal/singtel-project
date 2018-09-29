package com.singtel.assignment.model.animals;

import com.singtel.assignment.behaviours.impl.flyable.CanFly;
import com.singtel.assignment.behaviours.impl.singable.CanNotSing;

public class Butterfly extends Caterpillar {

    public Butterfly(){
        this.flyable =new CanFly();
        this.singable= new CanNotSing();
    }
}
