package supemir.irm.tp3.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Product {
    @Id @Column(length = 20)
    private String reference ;
    private String label ;
    private double price ;
    private int quantity ;
}
