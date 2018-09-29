package com.singtel.assignment;

import com.singtel.assignment.model.fish.Dolphin;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class DolphinTest extends AbstractTest {


    Dolphin dolphin;
    @Before
    public void setUp(){
        this.dolphin=new Dolphin();
    }


    @Test
    public void testWalk() {
        dolphin.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void testSing() {
        dolphin.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }


    @Test
    public void testSwim() {
        dolphin.swim();
        assertThat(sysOut.asString(), containsString("Great swimmers"));
    }
}


