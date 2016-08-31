
package lv.janis.repositories;

import lv.janis.domain.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author janis
 */
public interface ProductRepository extends MongoRepository<Product, String>{
    
}
