package supemir.irm.tp3.product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product) throws Exception;
    Product updateProduct(Product product) throws Exception;
    Product deleteProduct(Product product) throws Exception;
    Product getProduct(String ref) throws Exception;
    List<Product> getProducts() throws Exception;
    List<Product> getProductsByPriceLessThan(double priceLessThan) throws Exception;
}
