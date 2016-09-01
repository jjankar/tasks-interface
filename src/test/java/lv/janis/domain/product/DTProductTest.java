
package lv.janis.domain.product;


import lv.janis.domain.money.Money;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author janis
 */
public class DTProductTest {
    
    public DTProductTest() {
    }
   
    /**
     * Test of DTProduct constructor.
     */
    @Test
    public void testConstructor(){
     ProductInterface product = new Product();
     Money money = new Money(27,22);
     product.setPrice(money);
     DTProduct dtproduct = new DTProduct(product);
     String expResult = "22.27";
     String result = dtproduct.getPrice();
     assertEquals(expResult, result);
     
     
     
    }
    
    /**
     * Test of getId method, of class DTProduct.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        DTProduct instance = new DTProduct();
        instance.setId("test");
        String expResult = "test";
        String result = instance.getId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setId method, of class DTProduct.
     */
    @Test
    public void testSetId() {
       System.out.println("getId");
        DTProduct instance = new DTProduct();
        instance.setId("test");
        String expResult = "test";
        String result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getName method, of class DTProduct.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        DTProduct instance = new DTProduct();
        instance.setName("test");
        String expResult = "test";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class DTProduct.
     */
    @Test
    public void testSetName() {
        System.out.println("getName");
        DTProduct instance = new DTProduct();
        instance.setName("test");
        String expResult = "test";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAvailable method, of class DTProduct.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        DTProduct instance = new DTProduct();
        instance.setAvailable("test");
        String expResult = "test";
        String result = instance.getAvailable();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAvailable method, of class DTProduct.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("getAvailable");
        DTProduct instance = new DTProduct();
        instance.setAvailable("test");
        String expResult = "test";
        String result = instance.getAvailable();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPrice method, of class DTProduct.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        DTProduct instance = new DTProduct();
        instance.setPrice("test");
        String expResult = "test";
        String result = instance.getPrice();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPrice method, of class DTProduct.
     */
    @Test
    public void testSetPrice() {
        System.out.println("getPrice");
        DTProduct instance = new DTProduct();
        instance.setPrice("test");
        String expResult = "test";
        String result = instance.getPrice();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getVatRate method, of class DTProduct.
     */
    @Test
    public void testGetVatRate() {
        System.out.println("getVatRate");
        DTProduct instance = new DTProduct();
        instance.setVatRate("test");
        String expResult = "test";
        String result = instance.getVatRate();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setVatRate method, of class DTProduct.
     */
    @Test
    public void testSetVatRate() {
        System.out.println("getVatRate");
        DTProduct instance = new DTProduct();
        instance.setVatRate("test");
        String expResult = "test";
        String result = instance.getVatRate();
        assertEquals(expResult, result);
        
    }
    
}
