package tw.product.repository;

import org.springframework.stereotype.Repository;
import tw.product.model.Order;

import java.util.Optional;

@Repository
public interface OrderRepository {
    Optional<Order> findById(String id);
    void save(Order order);
}
