package hello.core.order;

/**
 * OrderService
 */
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}