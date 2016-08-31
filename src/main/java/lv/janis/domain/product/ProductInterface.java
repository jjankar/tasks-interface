
package lv.janis.domain.product;

import lv.janis.domain.money.MoneyInterface;

/**
 *
 * @author janis
 */
public interface ProductInterface {

    /**
     * @return the available
     */
    int getAvailable();

    /**
     * @return the name
     */
    String getName();

    /**
     * @return the money
     */
    MoneyInterface getPrice();

    /**
     * @return the vatRate
     */
    float getVatRate();

    /**
     * @param available the available to set
     */
    void setAvailable(int available);

    /**
     * @param name the name to set
     */
    void setName(String name);

    /**
     * @param money the money to set
     */
    void setPrice(MoneyInterface money);

    /**
     * @param vatRate the vatRate to set
     */
    void setVatRate(float vatRate);

    public String getId();
    
}
