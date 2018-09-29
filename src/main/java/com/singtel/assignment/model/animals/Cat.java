package com.singtel.assignment.model.animals;

import com.singtel.assignment.behaviours.impl.singable.CatSound;
import com.singtel.assignment.model.Animal;
import com.singtel.assignment.model.Parent;

public class Cat extends Animal {

    public Cat(){
        this.singable= new CatSound();
    }
}
