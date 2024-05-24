package tw.product.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
public class OrderItem {

    private BigDecimal quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private BigDecimal productPointInTimePrice;

    public OrderItem(Product product, BigDecimal quantity, BigDecimal productPointInTimePrice) {
        this.product = product;
        this.quantity = quantity;
        this.productPointInTimePrice = productPointInTimePrice;
    }

    public BigDecimal calculatePrice() {
        return this.productPointInTimePrice.multiply(quantity);
    }
}
