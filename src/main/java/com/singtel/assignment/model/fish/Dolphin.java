package com.singtel.assignment.model.fish;

import com.singtel.assignment.behaviours.Singable;
import com.singtel.assignment.behaviours.Walkable;
import com.singtel.assignment.behaviours.impl.swimmable.GreatSwimmers;
import com.singtel.assignment.model.Fish;
import com.singtel.assignment.model.Parent;

public class Dolphin extends Parent {

    Fish fish;

    public Dolphin(){
        this.swimmable= new GreatSwimmers();
        this.fish =new Fish();
        this.walkable = this.fish.getWalkable();
        this.singable = this.fish.getSingable();
    }

}
