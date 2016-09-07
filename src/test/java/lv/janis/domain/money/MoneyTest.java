package lv.janis.domain.money;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janis
 */
public class MoneyTest {

    public MoneyTest() {
    }

    /**
     * Test of getMinorUnit method, of class Money.
     */
    @Test
    public void testGetMinorUnit() {
        System.out.println("getMinorUnit");
        Money instance = new Money(999, 0);
        int expResult = 999;
        int result = instance.getMinorUnit();
        assertEquals(expResult, result);

    }

    /**
     * Test of Constructor, of class Money(String price). Limit (0,0)
     */
    @Test
    public void testConstructorLimit00() {
        Money money = new Money("0.0");
        assertEquals(0, money.getMinorUnit());
        assertEquals(0, money.getMajorUnit());
    }
    
    /**
     * Test of Constructor, of class Money(String price). Limit (2,null)
     */
     @Test
    public void testConstructorLimit22nocoma() {
        Money money = new Money("2");
        assertEquals(0, money.getMinorUnit());
        assertEquals(2, money.getMajorUnit());
    }

    /**
     * Test of Constructor, of class Money(String price). Limit (0,5)
     */
    @Test
    public void testConstructorLimit5() {
        Money money = new Money("0.456567");
        assertEquals(46, money.getMinorUnit());
        assertEquals(0, money.getMajorUnit());
    }
    
    /**
     * Test of Constructor, of class Money(String price). Limit (5,0)
     */
    @Test
    public void testConstructorLimit4() {
        Money money = new Money("123.54444444");
        assertEquals(54, money.getMinorUnit());
        assertEquals(123, money.getMajorUnit());
    }

    /**
     * Test of setMinorUnit method, of class Money.
     */
    @Test
    public void testSetMinorUnit() {
        System.out.println("setMinorUnit");
        Money instance = new Money();
        instance.setMinorUnit(999);
        int expResult = 999;
        int result = instance.getMinorUnit();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMajorUnit method, of class Money.
     */
    @Test
    public void testGetMajorUnit() {
        System.out.println("getMajorUnit");
        Money instance = new Money(0, 999);
        int expResult = 999;
        int result = instance.getMajorUnit();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMajorUnit method, of class Money.
     */
    @Test
    public void testSetMajorUnit() {
        System.out.println("setMajorUnit");
        Money instance = new Money();
        instance.setMajorUnit(999);
        int expResult = 999;
        int result = instance.getMajorUnit();
        assertEquals(expResult, result);
    }

}
