/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.janis.domain.money;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janis
 */
public class MoneyInterfaceTest {
    
    public MoneyInterfaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMajorUnit method, of class MoneyInterface.
     */
    @Test
    public void testGetMajorUnit() {
        System.out.println("getMajorUnit");
        MoneyInterface instance = new MoneyInterfaceImpl();
        int expResult = 0;
        int result = instance.getMajorUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinorUnit method, of class MoneyInterface.
     */
    @Test
    public void testGetMinorUnit() {
        System.out.println("getMinorUnit");
        MoneyInterface instance = new MoneyInterfaceImpl();
        int expResult = 0;
        int result = instance.getMinorUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMajorUnit method, of class MoneyInterface.
     */
    @Test
    public void testSetMajorUnit() {
        System.out.println("setMajorUnit");
        int majorUnit = 0;
        MoneyInterface instance = new MoneyInterfaceImpl();
        instance.setMajorUnit(majorUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinorUnit method, of class MoneyInterface.
     */
    @Test
    public void testSetMinorUnit() {
        System.out.println("setMinorUnit");
        int minorUnit = 0;
        MoneyInterface instance = new MoneyInterfaceImpl();
        instance.setMinorUnit(minorUnit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MoneyInterfaceImpl implements MoneyInterface {

        public int getMajorUnit() {
            return 0;
        }

        public int getMinorUnit() {
            return 0;
        }

        public void setMajorUnit(int majorUnit) {
        }

        public void setMinorUnit(int minorUnit) {
        }
    }
    
}
