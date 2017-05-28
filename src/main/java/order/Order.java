package order; /**
 * Created by asivatha on 5/27/2017.
 */

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {

    private String orderId;
    private String customerId;
    private List<OrderLine> orderLineList;
    private String invoiceDetails;
    private BigDecimal actualCartValue;
    private BigDecimal discountedCartValue;
    private Date orderedDate;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getInvoiceDetails() {
        return invoiceDetails;
    }

    public void setInvoiceDetails(String invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }
}
