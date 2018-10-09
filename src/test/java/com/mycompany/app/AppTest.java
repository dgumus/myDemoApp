package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;




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
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(5,6,7,8));
      assertTrue(new App().search(array,array1, 4,5));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2));
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(5,6));
      assertFalse(new App().search(array, array1, 100, 200));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      ArrayList<Integer> array1 = new ArrayList<>();
      assertFalse(new App().search(array, array1, 1,4));
    }

    public void testNull() {
      assertFalse(new App().search(null, null, 3, 1));
    }

}
