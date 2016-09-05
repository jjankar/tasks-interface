
package lv.janis.repositories;

import lv.janis.domain.cart.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author janis
 */
public interface CartRepository extends MongoRepository<Cart, String>{
    
}
