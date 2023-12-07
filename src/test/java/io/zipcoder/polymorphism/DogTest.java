package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Dictionary;

public class DogTest extends TestCase {


    public void testInheritance(){
        Dog d1 = new Dog();
        Assert.assertTrue(d1 instanceof Pet);

    }
    public void testSpeak() {
        // given
        String expected = "Bark!";
        Dog d1 = new Dog();
        //when
        String actual = d1.speak();
        //then
        Assert.assertEquals(expected, actual);

    }
}