package com.wipro.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
	public void testAdd() {
assertEquals(5, new Calculator().add(2,3));
}

    /**
     * @return the suite of tests being tested
     */
    @Test
public void testSub() {
assertEquals(5, new Calculator().sub(10,5));
}

    /**
     * Rigourous Test :-)
     */
   
}
