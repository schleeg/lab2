package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;


public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        String input = "chama";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("a","c","h","m"));
        ArrayList<String> check = task3.removeDuplicates(input);
        assertNotNull(check);
        assertEquals(expected, check);
    }

    @Test
    public void test_removeDuplicates_average(){
        String input = "";
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> check = task3.removeDuplicates(input);
        assertNotNull(check);
        assertEquals(expected, check);
    }

    @Test
    public void test_removeDuplicates_worst(){
        String input = null;
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> check = task3.removeDuplicates(input);
        assertNotNull(check);
        assertEquals(expected, check);
    }


    @Test
    public void test_areTheseAnagrams_best(){
        String test1 = "heart";
        String test2 = "earth";
        boolean check = task3.areTheseAnagrams(test1, test2);

        assertTrue(check);

    }

    @Test
    public void test_areTheseAnagrams_average(){
        String test1 = "";
        String test2 = "";
        boolean check = task3.areTheseAnagrams(test1, test2);

        assertTrue(check);

    }

    @Test
    public void test_areTheseAnagrams_worst(){
        String test1 = null;
        String test2 = null;
        boolean check = task3.areTheseAnagrams(test1, test2);

        assertFalse(check);

    }

}
