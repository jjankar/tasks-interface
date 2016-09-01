
package lv.janis.domain.product;

/**
 *
 * @author janis
 */
public class DTProduct {
    private String id;
    private String name;
    private String available;
    private String price;
    private String vatRate;

    public DTProduct() {
        
    }

    public DTProduct(String id, String name, String available, String price, String vatRate) {
        this.id = id;
        this.name = name;
        this.available = available;
        this.price = price;
        this.vatRate = vatRate;
    }
    
    

    public DTProduct(ProductInterface product) {
        this.id = product.getId();
        this.name = product.getName();
        this.available = String.valueOf(product.getAvailable()) ;
        int totalCents = product.getPrice().getMinorUnit()+
                           product.getPrice().getMajorUnit()*100;
        this.price = String.valueOf(totalCents/100);
        this.vatRate = String.valueOf(product.getVatRate());
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the available
     */
    public String getAvailable() {
        return available;
    }

    /**
     * @param available the available to set
     */
    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the vatRate
     */
    public String getVatRate() {
        return vatRate;
    }

    /**
     * @param vatRate the vatRate to set
     */
    public void setVatRate(String vatRate) {
        this.vatRate = vatRate;
    }
    
    
    
    
    
}
