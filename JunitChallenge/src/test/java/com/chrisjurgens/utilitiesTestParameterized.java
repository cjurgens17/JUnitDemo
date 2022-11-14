package com.chrisjurgens;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.testng.Assert.assertEquals;

@RunWith(Parameterized.class)
public class utilitiesTestParameterized {

    private Utilities utilities;
    private String expected;

    private String input;

    public utilitiesTestParameterized(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup(){
        utilities = new Utilities();
        System.out.println("Running a test");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                { "ABCDEFF","ABCDEF"},
                { "AB88EFFG","AB8EFG"},
                {"112233445566","123456"},
                {"ZYZQQB","ZYZQB"},
                {"A","A"}
        });
    }

    @Test
    public void removePairs(){
        assertEquals(expected,utilities.removePairs(input));
    }
}
