
package lv.janis.controllers;

import lv.janis.domain.product.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author janis
 */
public class CartController {

//show form
    @RequestMapping(value = "/shop/form", method = RequestMethod.GET)
    public String shopForm(Product product) {
        return "addProduct";
    }



    
}

