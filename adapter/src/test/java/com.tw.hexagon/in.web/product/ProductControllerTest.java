package tw.product.controller;

import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import tw.product.model.Product;
import tw.product.service.ProductService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ProductControllerTest {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductService productService;

    @Test
    public void testList() {
        Page<Product> products = Page.empty();
        when(productService.getProducts(anyInt(), anyInt())).thenReturn(products);

        Page<Product> result = productController.list(0, 15);

        assertEquals(products, result);
        verify(productService, times(1)).getProducts(0, 15);
    }
}