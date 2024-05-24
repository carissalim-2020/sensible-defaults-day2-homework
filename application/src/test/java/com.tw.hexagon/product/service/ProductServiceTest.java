package tw.product.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;
import tw.product.model.Product;
import tw.product.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@ActiveProfiles("test")
public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void testGetProducts() {
        Page<Product> products = Page.empty();
        when(productRepository.findAll(any(PageRequest.class))).thenReturn(products);

        Page<Product> result = productService.getProducts(0, 15);

        assertEquals(products, result);
        verify(productRepository, times(1)).findAll(PageRequest.of(0, 15));
    }
}