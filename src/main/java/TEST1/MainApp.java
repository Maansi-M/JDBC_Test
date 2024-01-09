package TEST1;

import TEST1.DAO.ServiceImpl;
import TEST1.DTO.Product;

import java.util.List;
import java.util.Scanner;

public class MainApp {

    static Scanner sc = new Scanner(System.in);
    static ServiceImpl service = new ServiceImpl();

    public static void main(String[] args) {

        System.out.println("\nSELECT OPERATION");
        System.out.println("1. DISPLAY ALL PRODUCTS");
        System.out.println("2. Remove Product");
        System.out.println("3. Update Product");
        System.out.println("4. PLACE ORDER ");
        System.out.println("5. DISPLAY ALL ORDERS ");
        System.out.println("6. Exit ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                displayAllProducts();
                break;
            case 2:
                removeProduct();
                break;
            case 3:
                //updateProduct();
                break;
            case 4:
                //placeOrder();
                break;
            case 5:
                //displayAllOrders();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("INVALID INPUT ");
        }

        main(args);
    }


    private static void removeProduct() {
        System.out.println("Enter productName ");
        String productName = sc.next();

        Product productToRemove = new Product();
        productToRemove.setProductName(productName);

        int rowsAffected = service.removeProduct(productToRemove);

        if (rowsAffected > 0) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found");
        }
    }


    public static List<Product> displayAllProducts() {
        List<Product> productList = service.displayAllProduct();
        System.out.println("PRODUCT LIST:");
        for (Product product : productList) {
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Quantity: " + product.getProductQty());
            System.out.println("Price: " + product.getProductPrice());
        }

        return productList;
    }

}








