package com.settermjd.entities;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;

public class UserTest extends TestCase {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UserTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( UserTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testGetNameShouldReturnEmptyStringIfNamePropertyIsNotSet()
    {
        User user = new User();
        String name = new String();
        assertEquals("Should have returned an empty string", name, user.getName());
    }

    public void testGetNameShouldReturnValueIfNamePropertyIsSet()
    {
        User user = new User();
        String name = new String("Matthew");
        user.setName(name);
        assertEquals(name, user.getName());
    }
}