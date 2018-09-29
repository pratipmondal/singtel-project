package com.singtel.assignment.behaviours.impl.walkable;

import com.singtel.assignment.behaviours.Walkable;

public class CrawlWalk implements Walkable {
    @Override
    public void walk() {
        System.out.println("I am crawling");
    }
}
