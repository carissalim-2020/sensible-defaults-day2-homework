package tw.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tw.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}