package supemir.irm.tp3.product;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    private final ProductRepository productRepository;

    public ProductConfig(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Bean
    CommandLineRunner init(){
        return args -> {
            //productRepository.save(new Product("R001","TV Sumsung",30000,12));
            productRepository.save(new Product("R002","TV Sumsung",50000,12));
            productRepository.save(new Product("R003","TV Sumsung",40000,12));
            productRepository.save(new Product("R004","TV Sumsung",20000,12));
            productRepository.save(new Product("R005","TV Sumsung",10000,12));
            productRepository.save(new Product("R006","TV Sumsung",100000,12));
        };
    }

}
