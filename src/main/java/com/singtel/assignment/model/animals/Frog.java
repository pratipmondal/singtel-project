package com.singtel.assignment.model.animals;

import com.singtel.assignment.behaviours.impl.singable.CanSing;
import com.singtel.assignment.model.Animal;
import com.singtel.assignment.model.Parent;

public class Frog extends Animal {

    public Frog(){
        this.singable =new CanSing();
    }

}
