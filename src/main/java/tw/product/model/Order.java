package tw.product.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Builder
public class Order {
    private String id;
    private OrderStatus status;
    private String shippingAddress;
    private List<OrderItem> orderItems;
    private BigDecimal totalPrice;

    public void addItem(OrderItem orderItem) {
        this.orderItems.add(orderItem);
        this.totalPrice = this.totalPrice.add(orderItem.calculatePrice());
    }

    public void updateItemQuantity(String productId, BigDecimal quantity) {
        this.orderItems.stream().filter(orderItem -> orderItem.getProduct().getId().equals(productId)).findFirst().ifPresent(orderItem -> {
            this.totalPrice = this.totalPrice.subtract(orderItem.calculatePrice());

            orderItem.setQuantity(quantity);

            this.totalPrice = this.totalPrice.add(orderItem.calculatePrice());
        });
    }

    public void removeItem(String productId) {
        this.orderItems.stream().filter(orderItem -> orderItem.getProduct().getId().equals(productId)).findFirst().ifPresent(orderItem -> {
            this.totalPrice = this.totalPrice.subtract(orderItem.calculatePrice());
            this.orderItems.remove(orderItem);
        });
    }
}
