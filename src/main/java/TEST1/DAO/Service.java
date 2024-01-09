package TEST1.DAO;
import TEST1.DTO.Product;
import TEST1.DTO.Order;
import java.util.List;


public interface Service {
    List<Product> displayAllProduct();
    int removeProduct(Product removeProduct);
    List<Order> displayAllOrder();
    int updateProduct(Product uptProduct);
    List<Order> placeOrder(String productName);
    int addProduct(Product addProduct);
}







