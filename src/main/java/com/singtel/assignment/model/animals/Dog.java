package com.singtel.assignment.model.animals;

import com.singtel.assignment.behaviours.impl.singable.DogSound;
import com.singtel.assignment.model.Animal;
import com.singtel.assignment.model.Parent;

public class Dog extends Animal {

    public Dog(){
        this.singable = new DogSound();
    }
}
