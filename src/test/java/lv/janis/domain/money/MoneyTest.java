package lv.janis.domain.money;

import static org.junit.Assert.*;
import org.junit.Test;

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
        assertEquals(999, instance.getMinorUnit());
    }

    /**
     * Test of setMinorUnit method, of class Money.
     */
    @Test
    public void testSetMinorUnit() {
        System.out.println("setMinorUnit");
        int minorUnit = 999;
        Money instance = new Money();
        instance.setMinorUnit(minorUnit);
        assertEquals(999, instance.getMinorUnit());
    }

    /**
     * Test of getMajorUnit method, of class Money.
     */
    @Test
    public void testGetMajorUnit() {
        System.out.println("getMajorUnit");
        Money instance = new Money(0, 999);
        assertEquals(999, instance.getMajorUnit());
    }

    /**
     * Test of setMajorUnit method, of class Money.
     */
    @Test
    public void testSetMajorUnit() {
        System.out.println("setMajorUnit");
        int majorUnit = 999;
        Money instance = new Money();
        instance.setMajorUnit(majorUnit);
        assertEquals(999, instance.getMajorUnit());
    }

}
