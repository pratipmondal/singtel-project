package com.singtel.assignment;

import com.singtel.assignment.behaviours.impl.singable.CatSound;
import com.singtel.assignment.behaviours.impl.singable.DogSound;
import com.singtel.assignment.behaviours.impl.singable.DuckSound;
import com.singtel.assignment.behaviours.impl.singable.RoosterSound;
import com.singtel.assignment.model.birds.Parrot;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ParrotTest extends AbstractTest {


    Parrot parrot;

    @Before
    public void setUp(){
        parrot= new Parrot();
    }

    @Test
    public void testParrotLivingWithDog(){
        parrot.setSingable(new DogSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Woof,woof"));

    }


    @Test
    public void testParrotLivingWithCat(){
        parrot.setSingable(new CatSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Meow"));
    }


    @Test
    public void testParrotLivingWithRooster(){
        parrot.setSingable(new RoosterSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }

    @Test
    public void testParrotLivingWithDuck(){
        parrot.setSingable(new DuckSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Quack,quack"));
    }

}
