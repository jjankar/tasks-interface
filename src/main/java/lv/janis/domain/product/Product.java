package lv.janis.domain.product;

import lv.janis.domain.money.MoneyInterface;
import org.springframework.data.annotation.Id;

/**
 *
 * @author janis
 */
public class Product implements ProductInterface {

    @Id
    private String Id;
    private String name;
    private int available;
    private MoneyInterface money;
    private float vatRate;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, int available) {
        this.name = name;
        this.available = available;
    }

    public Product(String name, int available, float vatRate) {
        this.name = name;
        this.available = available;
        this.vatRate = vatRate;
    }

    public Product(String name, int available, MoneyInterface money, float vatRate) {
        this.name = name;
        this.available = available;
        this.money = money;
        this.vatRate = vatRate;
    }

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the available
     */
    @Override
    public int getAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    @Override
    public void setAvailable(int available) {
        this.available = available;
    }

    /**
     * @return the money
     */
    @Override
    public MoneyInterface getPrice() {
        return money;
    }

    /**
     * @param money the money to set
     */
    @Override
    public void setPrice(MoneyInterface money) {
        this.money = money;
    }

    /**
     * @return the vatRate
     */
    @Override
    public float getVatRate() {
        return vatRate;
    }

    /**
     * @param vatRate the vatRate to set
     */
    @Override
    public void setVatRate(float vatRate) {
        this.vatRate = vatRate;
    }

    /**
     * @return the Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(String Id) {
        this.Id = Id;
    }

}
