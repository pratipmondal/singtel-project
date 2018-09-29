package com.singtel.assignment;

import com.singtel.assignment.model.fish.Clownfish;
import com.singtel.assignment.utils.Color;
import com.singtel.assignment.utils.Size;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class ClownfishTest extends AbstractTest{


    Clownfish clownfish;


    @Before
    public void setUp(){
        this.clownfish=new Clownfish();
    }


    @Test
    public void testWalk() {
        clownfish.walk();
        assertThat(sysOut.asString(), containsString("Can not walk"));
    }

    @Test
    public void testSing() {
        clownfish.sing();
        assertThat(sysOut.asString(), containsString("Can not sing"));
    }

    @Test
    public void testSwim() {
        clownfish.swim();
        assertThat(sysOut.asString(), containsString("I am swimming"));
    }

    @Test
    public void testSize() {
        Size size= clownfish.size();
        assertEquals(Size.SMALL,size);
    }

    @Test
    public void testColor() {
        Color color= clownfish.color();
        assertEquals(Color.ORANGE,color);
    }
}
