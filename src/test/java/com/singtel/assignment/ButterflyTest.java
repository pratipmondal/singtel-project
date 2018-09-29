package com.singtel.assignment;

import com.singtel.assignment.model.animals.Butterfly;
import com.singtel.assignment.model.animals.Caterpillar;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ButterflyTest extends AbstractTest {


    Butterfly butterfly;
    @Before
    public void setUp(){
        this.butterfly=new Butterfly();
    }


    @Test
    public void testFly() {
        butterfly.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void testSing() {
        butterfly.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }
}
