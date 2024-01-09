package TEST1.DTO;

public class Product {

    private int productId;
    private String productName;
    private int productQty;
    private double productPrice;

    public Product() {
    }

    public Product(String productName, int productQty, double productPrice) {
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;
    }

    public Product(int productId, String productName, int productQty, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQty() {
        return productQty;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
