package supemir.irm.tp3.product;

import org.hibernate.validator.constraints.ru.INN;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,String> {
    List<Product> findProductByPriceLessThan(double price);
    List<Product> findProductByLabelContainsAndQuantityGreaterThan(String label,double qte);
}
