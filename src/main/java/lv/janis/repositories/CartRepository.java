
package lv.janis.repositories;

import lv.janis.domain.product.ProductInterface;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author janis
 */
public interface CartRepository extends MongoRepository<ProductInterface, String>{
    
}
