package com.singtel.assignment.utils;

import com.singtel.assignment.behaviours.impl.flyable.CanFly;
import com.singtel.assignment.behaviours.impl.singable.CanSing;
import com.singtel.assignment.behaviours.impl.swimmable.CanSwim;
import com.singtel.assignment.behaviours.impl.walkable.CanWalk;
import com.singtel.assignment.model.Parent;

import java.util.Arrays;

public class CountAnimals {
    public int  walkableCount(Parent vertebrates[]) {
        return (int)Arrays.stream(vertebrates).filter(x -> (x.getWalkable()!=null && x.getWalkable() instanceof CanWalk)).count();
    }

    public int flyableCount(Parent[] vertebrates) {
        return (int)Arrays.stream(vertebrates).filter(x -> (x.getFlyable()!=null && x.getFlyable() instanceof CanFly)).count();
    }

    public int singableCount(Parent[] vertebrates) {
        return (int)Arrays.stream(vertebrates).filter(x -> (x.getSingable()!=null && x.getSingable() instanceof CanSing)).count();
    }

    public int swimmableCount(Parent[] vertebrates) {
        return (int)Arrays.stream(vertebrates).filter(x -> (x.getSwimmable()!=null && x.getSwimmable() instanceof CanSwim)).count();
    }
}
