/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordscramble;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wieha
 */
public class GameTest
{
    
    public GameTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getPlayerName method, of class Game.
     */
    @Test
    public void testGetPlayerName()
    {
        System.out.println("getPlayerName");
        Game instance = null;
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);

    }

    /**
     * Test of addAttempt method, of class Game.
     */
    @Test
    public void testAddAttempt()
    {
        System.out.println("addAttempt");
        String attempt = "";
        Game instance = null;
        instance.addAttempt(attempt);

    }

    /**
     * Test of getAttempts method, of class Game.
     */
    @Test
    public void testGetAttempts()
    {
        System.out.println("getAttempts");
        Game instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getAttempts();
        assertEquals(expResult, result);

    }

    /**
     * Test of displayReport method, of class Game.
     */
    @Test
    public void testDisplayReport()
    {
        System.out.println("displayReport");
        Game instance = null;
        instance.displayReport();

    }
    
}
