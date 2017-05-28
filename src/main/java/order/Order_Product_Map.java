package order;

/**
 * Created by asivatha on 5/27/2017.
 */
public class Order_Product_Map {

    private String orderId;
    private String productid;
    private int quantity;
    private String availedPromotion;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAvailedPromotion() {
        return availedPromotion;
    }

    public void setAvailedPromotion(String availedPromotion) {
        this.availedPromotion = availedPromotion;
    }
}
