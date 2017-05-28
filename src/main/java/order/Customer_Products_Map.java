package order;

/**
 * Created by asivatha on 5/27/2017.
 */
public class Customer_Products_Map {

    // composite primary key
    private String customerId;
    private String productId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
