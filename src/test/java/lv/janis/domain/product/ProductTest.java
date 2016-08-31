
package lv.janis.domain.product;

import lv.janis.domain.money.MoneyInterface;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author janis
 */
public class ProductTest {

    public ProductTest() {
    }

    /**
     * Test of getName method, of class Product.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Product instance = new Product();
        instance.setName("test");
        assertEquals("test", instance.getName());
    }

    /**
     * Test of setName method, of class Product.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Product instance = new Product();
        instance.setName("test");
        assertEquals("test", instance.getName());
    }

    /**
     * Test of getAvailable method, of class Product.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Product instance = new Product();
        instance.setAvailable(999);
        assertEquals(999, instance.getAvailable());
    }

    /**
     * Test of setAvailable method, of class Product.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        Product instance = new Product();
        instance.setAvailable(999);
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product();
        MoneyInterface expResult = null;
        MoneyInterface result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        MoneyInterface money = null;
        Product instance = new Product();
        instance.setPrice(money);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVatRate method, of class Product.
     */
    @Test
    public void testGetVatRate() {
        System.out.println("getVatRate");
        Product instance = new Product();
        float expResult = 0.0F;
        float result = instance.getVatRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVatRate method, of class Product.
     */
    @Test
    public void testSetVatRate() {
        System.out.println("setVatRate");
        float vatRate = 0.0F;
        Product instance = new Product();
        instance.setVatRate(vatRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
