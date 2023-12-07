package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class CatTest extends TestCase {

    public void testInheritance(){
        Cat c1 = new Cat();
        Assert.assertTrue(c1 instanceof Pet);
    }

    public void testSpeak() {
        //given
        String expected = "Meow!";
        Cat c1 = new Cat();
        //when
        String actual = c1.speak();
        //then
        Assert.assertEquals(expected, actual);
    }
}