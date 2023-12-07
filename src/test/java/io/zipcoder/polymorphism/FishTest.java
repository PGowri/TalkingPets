package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;

public class FishTest extends TestCase {

    public void testInheritance(){
        Fish f1 = new Fish();
        Assert.assertTrue(f1 instanceof Pet);
    }

    public void testSpeak() {
        String expected = "Fish!";
        Fish f1 = new Fish();
        String actual = f1.speak();
        Assert.assertEquals(expected, actual);
    }
}