/*
 * This Java source file was generated by the Gradle 'init' task.
 */


import org.junit.Test;

import static org.junit.Assert.*;



public class LibraryTest
{

    @Test
    public void testSomeLibraryMethod()
    {

        int x = 5;
        int y = 6;
        int sum = 11;

        Library classUnderTest = new Library();
        int res = classUnderTest.someLibraryMethod(x, y);
 
       assertEquals(sum, res);

    }

}
