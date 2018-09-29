package com.singtel.assignment;

import com.singtel.assignment.model.Animal;
import com.singtel.assignment.model.Bird;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class BirdTest {


    @Rule
    public SystemOutResource sysOut = new SystemOutResource();
    Bird bird;

    @Before
    public void setUp() {
        this.bird = new Bird();
    }

    @Test
    public void testWalk() {
        bird.walk();
        assertThat(sysOut.asString(), containsString("I am walking"));
    }


    @Test
    public void testFly() {
        bird.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void testSing() {
        bird.sing();
        assertThat(sysOut.asString(), containsString("I am singing"));
    }



}
