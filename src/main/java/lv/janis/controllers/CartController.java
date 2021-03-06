package lv.janis.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import lv.janis.domain.product.DTProduct;
import lv.janis.domain.product.ProductInterface;
import lv.janis.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    
    @RequestMapping(value = "/shop/form", method = RequestMethod.GET)
    public String contacts(Model model) {
        List<DTProduct> products = new ArrayList<DTProduct>();
        for (ProductInterface prodoct:repository.findAll())
        {
          products.add(new DTProduct(prodoct)); 
        }
        model.addAttribute("products", products);
        return "shop";
    }

    

}
