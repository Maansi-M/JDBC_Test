package TEST1.DTO;

public class Order {
    private int orderId;
    private String customerName;
    private int productId;

    private double productQty;

    private double total_amt;

    public Order() {
    }

    public Order(int orderId, String customerName, int productId, double productQty, double total_amt) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productId = productId;
        this.productQty = productQty;
        this.total_amt = total_amt;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getProductQty() {
        return productQty;
    }

    public void setProductQty(double productQty) {
        this.productQty = productQty;
    }

    public double getTotal_amt() {
        return total_amt;
    }

    public void setTotal_amt(double total_amt) {
        this.total_amt = total_amt;
    }
}

