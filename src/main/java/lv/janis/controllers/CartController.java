
package lv.janis.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import lv.janis.domain.product.DTProduct;
import lv.janis.domain.product.ProductInterface;
import lv.janis.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author janis
 */
public class CartController {
    
    @Autowired
    private ProductRepository repository;

    //show shop
    @RequestMapping(value = "/shop/form", method = RequestMethod.GET)
    public String shopForm(HttpSession session) {
        List<DTProduct> products = new ArrayList<>();
        repository.findAll().stream().forEach((prodoct) -> {
            products.add(new DTProduct(prodoct));
        });
        session.setAttribute("products", products);
        return "shop";
    }
    
    //delete product
    @RequestMapping(value = "/product/addToCart/{id}", method = RequestMethod.POST)
    public String deleteProduct(@PathVariable String id, HttpSession session) {
        
        return "redirect:/shop/card";
    }



    
}

