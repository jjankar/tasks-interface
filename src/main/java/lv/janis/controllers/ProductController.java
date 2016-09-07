package lv.janis.controllers;

import java.util.ArrayList;
import java.util.List;
import lv.janis.domain.money.Money;
import lv.janis.domain.product.DTProduct;
import lv.janis.domain.product.Product;
import lv.janis.domain.product.ProductInterface;
import lv.janis.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository repository;

    //show form
    @RequestMapping(value = "/product/add", method = RequestMethod.GET)
    public String showForm(Product product) {
        return "addProduct";
    }

    //add product
    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public String addProduct(@RequestParam("name") String name,
            @RequestParam("available") int available,
            @RequestParam("price") String price,
            @RequestParam("vatRate") float vatRate) {
        int amount = available;
        float vat = vatRate;
        ProductInterface product = new Product(name, amount,new Money(price),vat);
        repository.save(product);
        return "redirect:/products";
    }

    //delete product
    @RequestMapping(value = "product/delete/{id}", method = RequestMethod.POST)
    public String deleteProduct(@PathVariable String id) {
        repository.delete(id);
        return "redirect:/products";
    }

    //show all products
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String contacts(Model model) {
        List<DTProduct> products = new ArrayList<DTProduct>();
        for (ProductInterface prodoct:repository.findAll())
        {
          products.add(new DTProduct(prodoct)); 
        }
        model.addAttribute("products", products);
        return "products";
    }

}
