package order;

import offers.OfferDetail;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by asivatha on 5/27/2017.
 */
public class OrderLine {

    private String productId;
    private BigDecimal unitPrice;
    private String quantity;
    private BigDecimal actualPrice;
    private BigDecimal discountedPrice;
    private List<OfferDetail> offerDetails;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    public BigDecimal getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(BigDecimal discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
