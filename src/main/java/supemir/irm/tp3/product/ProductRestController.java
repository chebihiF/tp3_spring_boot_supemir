package supemir.irm.tp3.product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/products/")
public class ProductRestController {

    private final IProductService iProductService;

    public ProductRestController(IProductService iProductService) {
        this.iProductService = iProductService;
    }

    @GetMapping
    public List<Product> getAll(){
        try {
            return iProductService.getProducts();
        } catch (Exception e) {
            e.printStackTrace();
            return null ; // TODO: add exception handling
        }
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        try {
            return iProductService.addProduct(product);
        } catch (Exception e) {
            e.printStackTrace();
            return null ;
        }
    }

    @GetMapping(path = "/{ref}")
    public Product deleteProduct(@PathVariable String ref){
        try {
            return iProductService.deleteProduct(iProductService.getProduct(ref));
        } catch (Exception e) {
            e.printStackTrace();
            return null ;
        }
    }
}
