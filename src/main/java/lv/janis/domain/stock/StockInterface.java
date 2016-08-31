/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.janis.domain.stock;

import lv.janis.domain.product.ProductInterface;

/**
 *
 * @author janis
 */
public interface StockInterface {

    void addProduct(ProductInterface product);

    /**
     * @return the array
     */
    ProductInterface[] getArray();

    void removeProduct(ProductInterface product);
    
}
