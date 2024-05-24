package tw.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import tw.product.model.Product;
import tw.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/list")
    public Page<Product> list(@RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "15") int numberOfResults) {
        numberOfResults = Math.min(numberOfResults, 30);
        return productService.getProducts(page, numberOfResults);
    }

}