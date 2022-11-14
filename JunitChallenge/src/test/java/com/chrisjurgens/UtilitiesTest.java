package com.chrisjurgens;

import org.junit.*;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private static int counter;

    private Utilities utilities;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This is before the class COUNTER = "+ counter++);
    }

    @Before
    public void setup(){
        utilities = new Utilities();
        System.out.println("This prints before every method COUNTER = "+ counter++);
    }

    @Test
    public void everyNthChar() {
        char[] expect = {'e', 'l'};
        char[] input = utilities.everyNthChar(new char[]{'h','e','l','l','o'},2);
        char[] input2 = utilities.everyNthChar(new char[]{'h','e','l','l','o'},6);

        assertArrayEquals(expect,input);
        assertArrayEquals(new char[]{'h','e','l','l','o'},input2);

    }

    @Test
    public void removePairs() {
       assertEquals("ABCDEF",utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF",utilities.removePairs("ABCCABDEEF"));
        assertEquals("A",utilities.removePairs("A"));
        assertNull(null, utilities.removePairs(null));
        assertEquals("",utilities.removePairs(""));
    }


    @Test
    public void converter() {
        //testCase input: a = 10, b =5
        //output = 300
        assertEquals(300,utilities.converter(10,5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter_arithmeticException(){
        utilities.converter(10,0);
    }

    @Test
    public void nullIfOddLength() {
        assertNotNull("even",utilities.nullIfOddLength("even"));
        assertNull(utilities.nullIfOddLength("odd"));

    }

    @After
    public void afterEveryMethod(){
        System.out.println("This happens after every method");
    }

    @AfterClass
    public static void afterTheClass(){
        System.out.println("This prints after the class is done executing COUNTER = "+ counter++);
    }
}