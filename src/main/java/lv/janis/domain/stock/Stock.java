package lv.janis.domain.stock;

import lv.janis.domain.product.ProductInterface;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author janis
 */
public class Stock implements StockInterface {

    protected ProductInterface[] array;

    public Stock() {
    }

    public Stock(ProductInterface[] array) {
        this.array = array;
    }

    @Override
    public void addProduct(ProductInterface product) {
        this.array = ArrayUtils.add(array, product);
    }

    @Override
    public void removeProduct(ProductInterface product) {
        this.array = ArrayUtils.removeElement(array, product);
    }

    /**
     * @return the array
     */
    @Override
    public ProductInterface[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(ProductInterface[] array) {
        this.array = array;
    }

}
