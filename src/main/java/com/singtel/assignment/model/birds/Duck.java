package com.singtel.assignment.model.birds;

import com.singtel.assignment.behaviours.impl.singable.DuckSound;
import com.singtel.assignment.behaviours.impl.swimmable.CanSwim;
import com.singtel.assignment.model.Bird;

public class Duck extends Bird {

    public Duck(){
        this.singable =new DuckSound();
        this.swimmable= new CanSwim();
    }
}
