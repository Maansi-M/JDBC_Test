package TEST1.DAO;

import TEST1.DTO.Order;
import TEST1.DTO.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceImpl implements Service{

    static Connection conn = null ;

    static {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root" ;
        String password = "sql123";

        try {
            conn = DriverManager.getConnection(url , user , password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> displayAllProduct() {
        String selectQuery = "select product_name, product_qty, product_price from product_info; ";
        List<Product> productList = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                String name = rs.getString(1);
                int qty = rs.getInt(2);
                double price = rs.getDouble(3);
                Product pro = new Product(name , qty, price);
                productList.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return productList;
    }


    @Override
    public int removeProduct(Product removeProduct) {
        String deleteQuery = "DELETE FROM product_info WHERE product_name = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
            pstmt.setString(1, removeProduct.getProductName());
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }



    @Override
    public List<Order> displayAllOrder() {
        return null;
    }

    @Override
    public int updateProduct(Product uptProduct) {
        return 0;
    }

    @Override
    public List<Order> placeOrder(String productName) {
        return null;
    }

    @Override
    public int addProduct(Product addProduct) {
        return 0;
    }
}
