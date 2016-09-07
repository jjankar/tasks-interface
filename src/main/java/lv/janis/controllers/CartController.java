package lv.janis.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import lv.janis.domain.product.DTProduct;
import lv.janis.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author janis
 */
@Controller
public class CartController {

    @Autowired
    private ProductRepository repository;

    //show shop
    @RequestMapping(value = "/shop/form")
    public String shopForm(List<DTProduct> products, HttpSession session) {
        repository.findAll().stream().forEach((prodoct) -> {
            products.add(new DTProduct(prodoct));
        });
        session.setAttribute("products", products);
        return "shop";
    }

    //add product to cart
    @RequestMapping(value = "/product/addToCart/{id}", method = RequestMethod.POST)
    public String deleteProduct(@PathVariable String id, HttpSession session) {
        List<DTProduct> products = new ArrayList<>();
        products = (List<DTProduct>) session.getAttribute("products");
        products.forEach((product) -> {
            if (id.equals(product.getId()))
            System.out.println(product.getName());
        });
        return "redirect:/shop/card";
    }
    
    //view cart
    @RequestMapping(value = "/shop/card", method = RequestMethod.POST)
    public String addProduct() {
        return "cart";
    }

}
