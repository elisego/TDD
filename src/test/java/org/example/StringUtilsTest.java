package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StringUtilsTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1() {
        assertEquals("ae", StringUtils.vowels("aze"));
        assertEquals("aeiouy", StringUtils.vowels("aeiouyttt"));
    }

    @Test(expected=IllegalArgumentException.class)
    public void test2() {
        StringUtils.vowels(null);
    }

    @Test
    public void test3() {
        assertEquals("ae", StringUtils.vowels("aze"));
        assertEquals("aeiouy", StringUtils.uniqueVowels("aeiouyaaaeeettt"));
        assertEquals("aie", StringUtils.uniqueVowels("aaaaaiiiiittteeeee"));
    }
}
