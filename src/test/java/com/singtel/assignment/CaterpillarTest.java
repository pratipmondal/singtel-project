package com.singtel.assignment;

import com.singtel.assignment.model.animals.Caterpillar;
import com.singtel.assignment.model.fish.Dolphin;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CaterpillarTest extends AbstractTest{

    Caterpillar caterpillar;
    @Before
    public void setUp(){
        this.caterpillar=new Caterpillar();
    }

    @Test
    public void testWalk() {
        caterpillar.walk();
        assertThat(sysOut.asString(), containsString("I am crawling"));
    }

    @Test
    public void testFly() {
        caterpillar.fly();
        assertThat(sysOut.asString(), containsString("Can not fly"));
    }
}
